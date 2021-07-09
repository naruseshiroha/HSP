-- USER() 查询用户
-- 可以查看登录到 mysql 的有哪些用户,以及登录的 IP
SELECT
  USER();
-- DATABASE() 数据库名称
SELECT
  DATABASE();
-- MD5(str) 为字符串算出一个 MD5 32的字符串,(用户密码)加密
SELECT
  MD5('linux'),
  LENGTH(MD5('linux'));
--
  CREATE table users(
    id int AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(32) not null,
    pwd char(32) not NULL
  );
INSERT INTO
  users
VALUES
  (1, 'zyy', MD5('zyy'));
SELECT
  *
FROM
  users
where
  name = 'zyy'
  and pwd = MD5('zyy');
-- PASSWORD(str) 从原文密码 str 计算并返回密码字符串,通常用于对 mysql 数据库的用户密码加密 8.0+ removed
SELECT
  *
FROM
  mysql.user;