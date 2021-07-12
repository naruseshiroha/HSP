-- 针对 emp,dept,salgrade 创建一个视图 emp_view03 显示 empno,ename,dname,grade
create view emp_view03 as
SELECT
  DISTINCT empno,
  ename,
  dname,
  grade
FROM
  emp,
  dept,
  salgrade
where
  emp.deptno = dept.deptno
  and sal between losal
  and hisal;