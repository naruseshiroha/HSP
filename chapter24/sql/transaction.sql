create table t27(id int, `name` varchar(32));
-- 开启事务
start transaction;
-- 设置保存点
savepoint a;
-- DML操作
INSERT INTO
  t27
VALUES
  (1, 'tom');
savepoint b;
INSERT INTO
  t27
VALUES
  (2, 'jack');
-- 回退到 rollback to b
  rollback to b;
-- 回退到 rollback to a
  rollback to a;
-- 回退全部事务 rollback
  rollback;
-- 提交事务
  COMMIT;
SELECT
  *
FROM
  t27;