-- 脏读(dirty read): 当一个事务读取另一个事务尚未提交的改变(DML)时,产生脏读
-- 不可重复读(nonrepeatable read): 同意拆线呢在同一事务中多次进行,由于其他事务所做的修改和删除,每次返回不同的结果集,此事发生不可重复读
-- 幻读(phantom read): 同一查询在同一事务中多次进行,由于其他提交事务所做的插入操作,每次返回不同的结果集,此事发生幻读


-- 1.开两个mysql控制台
-- 2.查看当前mysql的默认隔离级别
SELECT
  @@transaction_isolation;
-- 3.把其中一个控制台的隔离级别设置 Read uncommitted
truncate table account;
set
  session transaction isolation level repeatable read;
-- 4.创建表
  create table `account`(
    id int PRIMARY KEY,
    `name` VARCHAR (32),
    `money` int
  );

  SELECT * FROM account;

  commit;
start transaction;
