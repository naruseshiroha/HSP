-- 1.显示每种岗位的雇员总数、平均工资。
SELECT
  COUNT(*),
  AVG(sal)
FROM
  emp
GROUP BY
  job;
-- 2.显示雇员总数，以及获得补助的雇员数。
SELECT
  COUNT(*),
  COUNT(comm)
FROM
  emp;
-- 统计没有获得补助的雇员数
SELECT
  COUNT(IF(comm is null, 1, null))
FROM
  emp;
SELECT
  COUNT(*) - COUNT(comm)
FROM
  emp;
-- 3.显示管理者的总人数。
SELECT
  COUNT(distinct mgr)
FROM
  emp;
-- 4.显示雇员工资的最大差额。
SELECT
  MAX(sal) - MIN(sal)
FROM
  emp;
-- 请统计各个部门的平均工资 ，并且是大于 1000 的，并且按照平均工资从高到低排序，取出前两行记录
SELECT
  deptno,
  AVG(sal) avg_sal
FROM
  emp
group by
  deptno
having
  avg_sal > 1000
order by
  avg_sal desc
limit
  0, 2;