-- select03
-- 查询姓名为赵云的学生成绩
SELECT
  *
FROM
  student
where
  name = '赵云';
-- 查询英语成绩大于语文成绩的同学
SELECT
  *
FROM
  student
where
  english > 90;
-- 查询总分大于 200 分的同学
SELECT
  *
FROM
  student
where
  chinese + english + math > 200;
-- 查询 math 大于 60 并且 id 大于 4 的学生成绩
SELECT
  *
FROM
  student
where
  math > 60
  and id > 4;
-- 查询英语成绩大于语文成绩的同学
SELECT
  *
FROM
  student
where
  english > chinese;
-- 查询总分大于 200 分,并且数学成绩大于语文成绩,姓赵的学生
SELECT
  *
FROM
  student
WHERE
  chinese + english + math > 200
  and math < chinese
  and `name` like '赵%';
-- 查询英语分数在 80-90 之间的同学
SELECT
  *
FROM
  student
WHERE
  english BETWEEN 80
  AND 90;
-- 查询数学分数为 89,90,91 的同学
SELECT
  *
FROM
  student
where
  math in (89, 90, 91);
-- 查询所有姓韩的学生成绩
SELECT
  `name`,
  chinese,
  english,
  math
FROM
  student
where
  `name` like '韩%';
-- 查询数学分 > 80,语文分 > 80 的同学
SELECT
  *
FROM
  student
where
  math > 80
  and chinese > 80;
-- 查询语文分数在 70-80 之间的的同学
SELECT
  *
FROM
  student
where
  chinese BETWEEN 70
  AND 80;
-- 查询总分为 221,233,242 的同学
SELECT
  *,(chinese + english + math)
FROM
  student
where
  (chinese + english + math) in (221, 233, 242);
-- 查询所有姓韩 或者 姓宋 的学生成绩
SELECT
  *
FROM
  student
where
  `name` like '韩%'
  or `name` like '宋%';
-- 查询数学比语文少 30 分的同学
SELECT
  *
FROM
  student
where
  chinese - math <= 10;