-- SUM()
SELECT
  SUM(COLUMN) {,
  SUM(COLUMN)...}
FROM
  [tablename] [WHERE where_condition];
-- 统计一个班级数学总成绩
SELECT
  SUM(math)
FROM
  student;
-- 统计一个班级语文、英语、数学各科的总成绩
SELECT
  SUM(chinese),
  SUM(english),
  SUM(math)
FROM
  student;
-- 统计一个班级语文、英语、数学的成绩总和
SELECT
  SUM(chinese + english + math)
FROM
  student;
-- 统计一个班级语文成绩平均分
SELECT
  SUM(chinese) / COUNT(chinese)
FROM
  student;
-- SUM() 仅对数值起作用,没有意义. 多列求和 ',' 不能少