-- MySQL 用户管理
-- 原因:当我们做项目开发时,可以根据不同的开发人员,赋给他相应的MySQL操作权限
-- 所以,MySQL数据库管理人员(root),根据需要创建不同的用户,付给相应的权限,供人员使用
-- 创建用户
-- create user '用户名'@'允许登录位置' identified by '密码';
-- mysql.user authentication_string 就是密码 password()加密后
create user 'test' @'localhost' identified by '123456';
SELECT
  `host`,
  `user`,
  `authentication_string`
FROM
  mysql.user;
SELECT
  password('123456');
-- 删除用户
  -- drop user '用户名'@'允许登录位置';
  drop user 'test' @'localhost';