-- 1.如果不开始事务,默认情况下,DML操作时自动提交的,不能回滚
INSERT INTO
  t27
VALUES
  (300, 'John');
-- 2.如果开始一个事务,你没有创建保存点.你可以执行 rollback,默认回滚到事务开始的状态
  start transaction;
INSERT INTO
  t27
VALUES
  (400, 'King'),(500, 'Smith');
-- 
  rollback;
  commit;
-- 3.也可以在这个事务中(还没有提交时),创建多个保存点.比如:savepoint a; 执行DML; savepoint b;

-- 4.可以在事务没有提交前,rollback to 选择回滚到哪个保存点

-- 5.mysql 的事务机制需要 INNODB 的存储引擎才可以使用,myISAM 不好使

-- 6.开始一个事务 start transaction;, set autocommit=off;