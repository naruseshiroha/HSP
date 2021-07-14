--1).列出至少有一个员工的所有部门
SELECT
  deptno,
  COUNT(deptno) num
FROM
  emp
group by
  deptno
having
  num > 0;
--2).列出薪金比"SMITH"多的员工
SELECT
  *
FROM
  emp
where
  sal > (
    SELECT
      sal
    FROM
      emp
    where
      ename = 'SMITH'
  );
--3).列出受雇日期晚于其直接上级的所有员工
SELECT
  e1.empno no1,
  e1.ename ename1,
  e1.hiredate h1,
  e1.mgr mg1,
  e2.ename ename2,
  e2.hiredate h2
FROM
  emp e1,
  emp e2
where
  e1.mgr = e2.empno
  and e1.hiredate > e2.hiredate;
--4).列出部门名称和这些部门的员工信息,同时列出那些没有员工的部门
SELECT
  dept.deptno,
  dname,
  ename
FROM
  dept
  left join emp on dept.deptno = emp.deptno;
--5).列出所有"CLERK"的姓名及其部门名称
SELECT
  ename,
  dname,
  job
FROM
  dept,
  emp
where
  dept.deptno = emp.deptno
  and job = 'CLERK';
--6).列出最低薪金大于1500的各种工作
SELECT
  MIN(sal) min_sal,
  job
FROM
  emp
group by
  job
having
  min_sal > 1500;
--7).列出在部门"SALES"工作的员工姓名
SELECT
  ename,
  dname
FROM
  emp,
  dept
where
  dept.deptno = emp.deptno
  and dname = 'SALES';
--8).列出薪金高于公司平均薪金的所有员工
SELECT
  *
FROM
  emp
where
  sal > (
    select
      AVG(sal)
    from
      emp
  );
--9).列出与"SCOTT"从事相同工作的所有员工
SELECT
  *
FROM
  emp
where
  ename != 'SCOTT'
  and job = (
    SELECT
      job
    FROM
      emp
    where
      ename = 'SCOTT'
  );
--10).列出薪金高于在部门30工作的所有员工的薪金的员工姓名和薪金
SELECT
  *
FROM
  emp
where
  sal > (
    SELECT
      MAX(sal)
    from
      emp
    where
      deptno = 30
  );
--11).列出在每个部门工作的员工数量、平均工资和平均服务期限
SELECT
  deptno,
  count(empno),
  avg(sal),
  avg(datediff(now(), hiredate))
FROM
  emp
group by
  deptno;
--12).列出所有员工的姓名、部门名称和工资
SELECT
  ename,
  dname,
  sal
FROM
  emp,
  dept
where
  emp.deptno = dept.deptno;
--13).列出所有部门的详细信息和部门人数
SELECT
  dept.deptno,
  dname,
  loc,
  count(empno)
FROM
  dept
  LEFT JOIN emp on dept.deptno = emp.deptno
GROUP BY
  dept.deptno,
  dname,
  loc;
--14).列出各种工作的最低工资
SELECT
  job,
  MIN(sal)
FROM
  emp
group by
  job;
--15).列出MANAGER(经理)的最低薪金
SELECT
  MIN(sal)
FROM
  emp
where
  job = 'MANAGER';
--16).列出所有员工的年工资,按年薪从低到高排序
SELECT
  ename,(sal + IFNULL(comm, 0)) * 12 year_sal
FROM
  emp
order by
  year_sal;