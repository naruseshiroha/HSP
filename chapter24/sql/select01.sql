-- select
-- Select 指定查询哪些列的数据
-- column 指定列名
-- *代表查询所有列
-- From 指定查询哪张表
-- DISTINCT 可选,指显示结果时,是否去掉重复数据
SELECT
  [DISTINCT] * | { column1 }
FROM
  [tablename];
-- as 别名
SELECT [column] AS 别名 FROM tablename;
-- 1.查询表中所有学生信息
SELECT
  *
FROM
  student;
-- 2.查询表中所有学生的姓名和对应的英语成绩
SELECT
  `name`,
  english
from
  student;
-- 3.过滤表中重复数据 distinct
SELECT
  DISTINCT english
FROM
  student;
-- 4.要查询的记录,每个字段都相同,才会去重
SELECT
  DISTINCT `name`,
  english
FROM
  student;