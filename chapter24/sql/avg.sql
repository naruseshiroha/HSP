-- AVG()
SELECT
  AVG(COLUMN) {,
  AVG(COLUMN)...}
FROM
  [tablename] [WHERE where_condidtion];
-- 求一个班级数学平均分
SELECT
  AVG(math)
FROM
  student;
-- 求一个班级总分平均分
SELECT
  AVG(chinese + english + math)
FROM
  student;