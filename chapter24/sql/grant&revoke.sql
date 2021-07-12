-- 授权
-- grant 权限列表 on 库.对象名 to '用户名'@'登录位置' [identified by 'password']
-- 1.权限列表,多个权限用逗号分开
-- grant select on *.* to '用户名'@'登录位置'
-- grant select, delete, create on *.* to '用户名'@'登录位置'
-- grant all [privileges] on ... 表示赋予该用户在该对象上的所有权限
-- 2.特别说明
-- *.*: 代表本系统中所有数据库的所有对象(表,视图,存储过程)
-- 库.*: 代表某个数据库中的所有对象(表,视图,存储过程)
-- 3.identified by 可以省略,也可以写出
-- (1).如果该用户存在,就是修改该用户的密码
-- (2).如果该用户不存在,就是创建该用户

-- 回收
-- revoke 权限列表 on 库.对象名 from '用户名'@'登录位置'

-- 权限生效指令(5.7以后默认生效,不需要执行)
-- flush privileges;
