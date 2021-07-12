-- detail
-- 1.在创建用户的时候,如果不指定Host,则为%,%表示所有IP都有连接权限
create user 'lx';
-- 'lx' @'%' 密码 '';
drop user 'lx';
select
  `host`,
  `user`,
  `authentication_string`
from
  mysql.user;
-- 2.也可以这样指定 ,表示 'lx' 在 '192.168.1.*' 的 ip 可以登录 mysql
  -- create user 'lx' @'192.168.1.%' [identified by 'password'];
  -- 3.在删除用户的时候,如果 host 不是 '%',需明确指定 'user'@'host'