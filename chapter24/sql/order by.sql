-- order by
-- 1.ORDER BY 指定排序的列,排序的列即可以是表中的列名,也可以是 SELECT 语句后指定的列名
-- 2.ASC 升序(默认)、DESC 降序
-- 3.ORDER BY 子句应位于 SELECT 语句的结尾
SELECT
  column1 [,column2]
FROM
  tablename
ORDER BY
  [column] ASC | DESC;
-- 对数学成绩排序后输出[升序]
SELECT
  *
FROM
  student
ORDER BY
  math;
-- 对总分按从高到低的顺序输出
SELECT
  *
FROM
  student;
ORDER BY
  (chinese + english + math) DESC;
-- 对姓韩的学生成绩排序输出[升序]
SELECT
  *
FROM
  student
where
  `name` like '韩%'
ORDER BY
  (chinese + english + math);
