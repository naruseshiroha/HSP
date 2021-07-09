-- ?显示雇员名,雇员工资及所在部门的名字 【笛卡尔集】
SELECT
  ename,
  sal,
  dname
FROM
  emp e
  left join dept d on e.deptno = d.deptno;
-- 老韩小技巧：多表查询的条件不能少于 表的个数-1, 否则会出现笛卡尔集
  -- ?如何显示部门号为 10 的部门名、员工名和工资
SELECT
  ename,
  sal,
  d.deptno,
  dname
FROM
  emp e
  left join dept d on e.deptno = d.deptno
where
  d.deptno = 10;
-- ?显示各个员工的姓名，工资，及其工资的级别
SELECT
  ename,
  sal,
  dname,
  grade
FROM
  emp e
  left join dept d on e.deptno = d.deptno
  left join salgrade s on sal BETWEEN s.losal
  AND s.hisal;
-- 显示雇员名,雇员工资及所在部门的名字,并按照部门编号降序
SELECT
  ename,
  sal,
  d.deptno,
  dname
FROM
  emp e
  left join dept d on e.deptno = d.deptno
ORDER BY
  d.deptno DESC;