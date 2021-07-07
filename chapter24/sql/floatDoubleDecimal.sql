-- 1.Float/Double [UNSIGNED]
-- Float 单精度, Double 双精度
-- 2.Decimal[M,D] [UNSIGNED]
----可以支持更加精确的小数位, M 是小数位数(精度)的总数,D 是小数点(标度)后面的位数
----如果 D 是 0,则值没有小数点或小数部分. M 最大 65. D 最大 30. 如果 D 被省略,默认是 0.如果 M 被省略,默认是 10
create table t4(
  num1 FLOAT,
  num2 DOUBLE,
  mum3 DECIMAL (30, 20)
);
INSERT INTO
  t4
VALUES
  (
    88.12345678912345,
    88.12345678912345,
    88.12345678912345
  );
SELECT
  *
FROM
  t4;
-- Decimal 可以放很大的数
  CREATE table t5 (num DECIMAL (65));
INSERT INTO
  t5
VALUES
  (
    8999999933338388388383838838383009338388383838383838383
  );
SELECT
  *
FROM
  t5;
-- bigint
  create table t6(num BIGINT UNSIGNED);
INSERT INTO
  t6
VALUES
  (9999999999999999999);
SELECT
  *
FROM
  t6;