-- 1.选择部门30中的所有员工
SELECT
  *
FROM
  emp
where
  deptno = 30;
-- 2.列出所有办事员(CLERK)的姓名,编号和部门编号
SELECT
  empno,
  ename,
  deptno,
  job
FROM
  emp
where
  job = 'CLERK';
-- 3.找出佣金高于薪金的员工
SELECT
  *
FROM
  emp
where
  IFNULL(comm, 0) > sal;
-- 4.找出佣金高于薪金60%的员工
SELECT
  *
FROM
  emp
where
  IFNULL(comm, 0) > sal * 0.6;
-- 5.找出部门10中所有经理(MANAGER)和部门20中所有办事员(CLERK)的详细资料
SELECT
  *
FROM
  emp
where
  (
    deptno = 10
    and job = 'MANAGER'
  )
  or (
    deptno = 20
    and job = 'CLERK'
  );
-- 6.找出部门10中所有经理(MANAGE),部门20中所有办事员(CLERK),还有既不是经理又不是办事员,但其薪金大于或等于2000的所有员工的详细资料
SELECT
  *
FROM
  emp
where
  (
    deptno = 10
    and job = 'MANAGER'
  )
  or (
    deptno = 20
    and job = 'CLERK'
  )
  or (
    job not in('MANAGER', 'CLERK')
    and sal >= 2000
  );
-- 7.找出收取佣金的员工的不同工作
SELECT
  distinct job
FROM
  emp
where
  comm is not null;
-- 8.找出不收取佣金或收取的佣金低于100的员工
SELECT
  *
FROM
  emp
where
  ifnull(comm, 0) < 100;
-- 9.找出各月倒数第三天受雇的所有员工
SELECT
  *
from
  emp
where
  last_day(hiredate) -2 = hiredate;
-- 10.找出早于12年前受雇的员工
SELECT
  *
FROM
  emp
where
  DATE_ADD(hiredate, interval 12 year) < now();
-- 11.以字母小写的方式显示所有员工的的姓名
SELECT
  CONCAT(LCASE(LEFT(ename, 1)), substring(ename, 2))
FROM
  emp;
-- 12.显示正好为5个字符的员工的姓名
select
  ename
from
  emp
where
  LENGTH(ename) = 5;
-- 13.显示不带有"R"的员工的姓名
SELECT
  ename
FROM
  emp
where
  ename not like '%R%';
-- 14.显示所有员工姓名的前三个字符
SELECT
  left(ename, 3)
FROM
  emp;
-- 15.显示所有员工的姓名,用'a'替换所有'A'
SELECT
  replace(ename, 'A', 'a')
FROM
  emp;
-- 16.显示满10年服务年限的员工的姓名和受雇日期
SELECT
  ename,
  hiredate
FROM
  emp
where
  (year(now()) - year(hiredate)) >= 10;
-- 17.显示员工的详细资料,按姓名排序
SELECT
  *
FROM
  emp
order by
  ename;
-- 18.显示所有员工的姓名和受雇日期,根据其服务年限,将最老的员工排在最前面
SELECT
  ename,
  hiredate,(year(now()) - year(hiredate)) nx
FROM
  emp
order by
  nx desc;
-- 19.显示所有员工的姓名、工作和薪金,按工作降序排序,若工作相同则按薪金排序
SELECT
  *
FROM
  emp
order by
  job desc,
  sal desc;
-- 20.显示所有员工的姓名、加入公司的年份和月份,按受雇日期所在月排序,若月份相同则将最早年份的员工排在最前面
SELECT
  ename,
  year(hiredate) y,
  month(hiredate) m
FROM
  emp
order by
  m,
  y;
-- 21.显示在一个月为30的情况所有员工的日薪金,忽略余数
SELECT
  FLOOR(sal / 30)
FROM
  emp;
-- 22.找出(任何年份的)2月受聘的所有员工
SELECT
  *
FROM
  emp
where
  month(hiredate) = 2;
-- 23.对于每个员工,显示其加入公司的天数
SELECT
  DATEDIFF(now(), hiredate)
FROM
  emp;
-- 24.显示姓名字段的任何 位置包含'A'的所有员工的姓名
SELECT
  *
FROM
  emp
where
  ename like '%A%';
-- 25.以年月日的方式显示所有员工的年限
SELECT
  ename,
  floor(datediff(now(), hiredate) / 365) y,
  floor(datediff(now(), hiredate) % 365 / 31) m,
  datediff(now(), hiredate) % 31 d
FROM
  emp;