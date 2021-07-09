-- 自我赋值(蠕虫复制)
-- 为了对某个 sql 语句进行效率测试，我们需要海量数据时，可以使用此法为表创建海量数据
CREATE table my_tab01(
  id int,
  `name` VARCHAR (32),
  sal DOUBLE,
  job VARCHAR(32),
  deptno int
);
DROP table my_tab01;
-- 1.把 emp 表的记录复制到 my_tab01
INSERT INTO
  my_tab01 (
    SELECT
      empno,
      ename,
      sal,
      job,
      deptno
    FROM
      emp
  );
INSERT INTO
  my_tab01 (
    SELECT
      *
    FROM
      my_tab01
  );
SELECT
  COUNT(*)
FROM
  my_tab01;
-- 如何删除一张表的重复记录
  -- 1. 先创建一张表 my_tab02,
  -- 2. 让 my_tab02 有重复的记录
  -- 这个语句 把 emp 表的结构(列)，复制到 my_tab02
  CREATE table my_tab02 like emp;
INSERT INTO
  my_tab02 (
    SELECT
      *
    FROM
      emp
  );
SELECT
  distinct *
FROM
  my_tab02;
-- 3.考虑去重
  create table my_tab03 like my_tab02;
INSERT INTO
  my_tab03 (
    SELECT
      distinct *
    FROM
      my_tab02
  );
drop table my_tab02;
rename table my_tab03 to my_tab02;
SELECT
  *
FROM
  my_tab02;