-- 1.查看当前会话隔离级别
select
  @ @transaction_isolation;
-- 2.查看系统当前隔离级别
select
  @ @global.transaction_isolation;
-- 3.设置当前会话隔离级别
set
  session transaction isolation level serializable;
-- 4.设置当前系统隔离级别
set
  global transaction isolation level serializable;
-- 5.MySQL 默认隔离级别 repeatable read,一般情况下,没有特殊要求,没有必要修改