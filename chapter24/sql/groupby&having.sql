-- GROUP BY COLUMN HAVING
-- GROUP BY 用于对查询的结果分组统计
-- HAVING 用于限制分组显示结果
SELECT
  COLUMN1,
  COLUMN2
FROM
  tablename
GROUP BY
  COLUMN1
HAVING
  having_condition;
show tables;
SELECT
  *
FROM
  emp;
-- 如何显示每个部门的平均工资和最高工资
SELECT
  AVG(sal),
  MAX(sal),
  deptno
FROM
  emp
GROUP BY
  deptno;
-- 显示每个部门的每种岗位的平均工资和最低工资
SELECT
  AVG(sal),
  MIN(sal),
  deptno,
  job
FROM
  emp
GROUP BY
  deptno,
  job;
-- 显示平均工资低于2000的部门号和它的平均工资
SELECT
  AVG(sal) avg_sal,
  deptno
FROM
  emp
GROUP BY
  deptno
HAVING
  avg_sal < 2000;