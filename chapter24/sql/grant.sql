-- 1.创建一个用户,密码123,并且只可以从本地登录,不让远程登录mysql
create user 'lx' @'localhost' identified by '123';
SELECT
  `host`,
  `user`,
  `authentication_string`
FROM
  mysql.user;
-- 2.创建库和表 testdb 下的 news 表
  create database testdb;
use testdb;
create table news(
    id int PRIMARY KEY,
    title varchar(32),
    content text,
    relase_time datetime default CURRENT_TIMESTAMP
  );
drop table news;
INSERT INTO
  news
VALUES
  (1, 'sony', '索尼大法好', null);
-- 3.给用户分配查看 news 表 和 添加数据 的权限
  grant
select,
insert
  on testdb.news to 'lx' @'localhost';
-- mysql8 需要 mysql_native_password
  alter user 'lx' @'localhost' identified with mysql_native_password by '123';
-- 4.测试看看用户是否只有这几个权限
SELECT
  *
FROM
  news;
INSERT INTO
  news
VALUES(3, 'sansung', 'SanSung tab s7+', NULL);
-- DELETE command denied to user 'lx'@'localhost' for table 'news'
DELETE FROM
  news
WHERE
  id = 3;
-- UPDATE command denied to user 'lx'@'localhost' for table 'news'
UPDATE
  news
SET
  relase_time = NOW()
WHERE
  id = 1;
-- 5.修改密码为 abc
  alter user 'lx' @'localhost' identified by 'abc';
-- 6.回收权限
  revoke
insert
  on testdb.news
from
  'lx' @'localhost';
revoke all on testdb.news
from
  'lx' @'localhost';
-- 7.删除 lx
  drop user 'lx' @'localhost';