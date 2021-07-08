SELECT
  *
FROM
  employee;
desc employee;
INSERT INTO
  employee
VALUES
  (
    2,
    '小菜鸟',
    '1999-09-09',
    '2019-12-01 13:00:00',
    'java初级',
    4500,
    '熟悉 java spring mybatis',
    null
  ),
  (
    3,
    '老滑水',
    '1997-07-07',
    '2017-07-01 13:00:00',
    'java中级',
    5500,
    '熟悉 java spring springboot mybatis mysql',
    null
  );
-- update
  -- 1.UPDATE 语法可以用新值更新原有表行中的各列
  -- 2.SET 子句表示要修改哪些列和要给予哪些值
  -- 3.WHERE 自居指定更新哪些行.如果没有 WHERE 子句,则更新所有行(记录)
  -- 4.如果需要修改多个字段,可以通过 set filed=value,filed2=value2
update
  [tablename]
set
  [column] = expr [,column=expr] [WHERE where_condition];
-- 将所有员工薪水改为 5000
update
  employee
set
  salary = 5000;
-- 将 '小菜鸟' 的员工薪水改为 3000 元
update
  employee
set
  salary = 3000
where
  username = '小菜鸟';
-- 将 '老划水' 的员工薪水改为 3000 元
update
  employee
set
  salary = salary + 1000
where
  username = '老划水';
SELECT
  *
FROM
  employee;