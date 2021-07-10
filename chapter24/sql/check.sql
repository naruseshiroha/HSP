-- check
-- 用于强制行数据必须满足的条件,mysql 5.7 不支持,只做语法校验,但不会生效
CREATE table t23(
  id int PRIMARY KEY AUTO_INCREMENT,
  `name` VARCHAR(32),
  gender char(1) check(gender in ('男', '女'))
);
INSERT INTO
  t23
VALUES
  (1, 'zs', '1');
SELECT
  *
FROM
  t23;