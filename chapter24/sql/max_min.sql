-- MAX()/MIN()
SELECT
  MAX(COLUMN)
from
  tablename [WHERE where_condition];
-- 求班级最高分和最低分
SELECT
  MAX(chinese + english + math),
  MIN(chinese + english + math)
FROM
  student;
-- 求出班级数学最高分和最低分
SELECT
  MAX(math),
  MIN(math)
FROM
  student;