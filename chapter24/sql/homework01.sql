-- 1).以下哪条语句是错误的 D
-- A.select empno,ename name,sal salary from emp;
-- B.select empno,ename name,sal as salary from emp;
-- C.select ename name,sal * 12 as 'Annual Salary' from emp;
-- D.select ename name,sal * 12 Annual Salary from emp;
-- 2).某用户希望补助非空的所有雇员信息,应该使用哪条语句 B
-- A.select ename,sal,comm from emp where comm <> null;
-- B.select ename,sal,comm from emp where comm is not null;
-- C.select ename,sal,comm from emp where comm <> 0;
-- 3).以下哪条语句是错误的 C
-- A.select ename,sal salary from emp order by sal;
-- B.select ename,sal salary from emp order by salary;
-- C.select ename,sal salary from emp order by 3;