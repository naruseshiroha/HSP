-- COUNT()
SELECT
  COUNT(*) | COUNT(COLUMN)
FROM
  tablename [WHERE where_condition];
-- 统计一个班共有多少学生
SELECT
  count(*) num
FROM
  student;
-- 统计数学成绩大于 90 的学生有多少个
SELECT
  COUNT(id) num
FROM
  student
where
  math > 90;
-- 统计总分大于 250 的人数有多少
SELECT
  COUNT(id)
FROM
  student
where
  (chinese + english + math) > 250;
-- COUNT(*) 和 COUNT(column) 的区别
-- COUNT(*): 返回满足条件的记录的行数
-- COUNT(column): 统计满足条件的某列有多少个，但是会排除为 null 的情况
create Table t13(`name` varchar(20));
INSERT INTO
  t13
VALUES
  ('tom'),('jack'),('marry'),(null);
SELECT
  COUNT(*),
  COUNT(`name`)
FROM
  t13;