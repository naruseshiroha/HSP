-- select02
-- 统计每个学生的总分
SELECT
  `name`,
  chinese + english + math
from
  student;
-- 在所有学生总分加10分的情况
SELECT
  `name`,
  chinese + english + math + 10
from
  student;
-- 使用别名表示学生分数
SELECT
  `name`,
  chinese + english + math + 10 AS total
from
  student;
-- 在赵云的总分上增加60%
SELECT
  `name`,(chinese + english + math) * 1.6
FROM
  student
where
  name = '赵云';
-- 统计关羽的总分
SELECT
  `name`,(chinese + english + math)
FROM
  student
WHERE
  name = '关羽';
-- 使用别名表示学生的数学分数
SELECT
  `name`,(chinese + english + math) AS total
FROM
  student;