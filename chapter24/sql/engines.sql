-- 存储引擎 分为两类, 一类是 事务安全型(INNODB),另一类是 非事务安全型
-- 查看所有的存储引擎
show engines;
-- innodb
-- 1.支持事务 2.支持外键 3.支持行级锁
-- myisam
create table t28(id int, `name` varchar(32)) engine myisam;
-- 1.添加速度快 2.不支持外键和事务 3.支持表级锁
start transaction;
savepoint a;
INSERT INTO
  t28
VALUES
  (1, 'tom');
rollback to a;
SELECT
  *
FROM
  t28;
-- memory
  create table t29(id int, `name` varchar(32)) engine memory;
-- 1.数据存储在内存中 2.执行速度很快(内存中 没有IO读写) 3.默认支持哈希(hash表)
INSERT INTO
  t29
VALUES
  (1, 'tom'),(2, 'jack'),(3, 'Smith');
SELECT
  *
FROM
  t29;

-- 修改存储引擎
alter table t29 engine = innodb;