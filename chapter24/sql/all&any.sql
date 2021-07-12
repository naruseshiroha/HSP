-- 显示工资比部门 30 的所有员工的工资高的员工的姓名、工资和部门号
SELECT
  ename,
  sal,
  deptno
FROM
  emp
WHERE
  --   sal > (select MAX(sal) from emp where deptno = 30);
  sal > ALL(
    SELECT
      sal
    from
      emp
    WHERE
      deptno = 30
  );
-- 显示工资比部门 30 的其中一个员工的工资高的员工的姓名、工资和部门号
SELECT
  ename,
  sal,
  deptno
FROM
  emp
WHERE
  --   sal > (select MIN(sal) from emp where deptno = 30);
  sal > ANY(
    SELECT
      sal
    from
      emp
    WHERE
      deptno = 30
  );