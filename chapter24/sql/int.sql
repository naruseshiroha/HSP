-- 1.如果没有指定 UNSIGNED,则 TINYINT 就是有符号 -128-127
-- 2.如果指定 UNSIGNED,则 TINYINT 就是无符号 0-255
create table t1(id TINYINT);
create table t2(id TINYINT UNSIGNED);
INSERT INTO
  t1
VALUES(128);
-- Out of range value for column 'id' at row 1
INSERT INTO
  t2
VALUES(255);