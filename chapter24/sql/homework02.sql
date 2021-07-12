-- 2.写出查询表 dept,emp 的结构的 sql 语句
desc dept;
desc emp;
-- 3.使用简单查询语句完成
-- 1).显示所有部门名称
-- 2).显示所有雇员名及其全年收入 13*(sal+comm),并指定列别名 '年收入'
SELECT
  distinct dname
FROM
  dept;
SELECT
  ename,
  (13 * (sal + (IFNULL(comm, 0)))) '年收入'
FROM
  emp;
-- 4.限制查询数据
  -- 1).显示工资超过2850的雇员姓名和工资
SELECT
  *
FROM
  emp
where
  sal > 2850;
-- 2).显示工资不在1500到2850之间的所有雇员名及工资
SELECT
  *
FROM
  emp
where
  sal not BETWEEN 1500
  and 2850;
-- 3).显示编号为7566的雇员姓名及所在部门编号
SELECT
  ename,
  deptno
FROM
  emp
where
  empno = 7566;
-- 4).显示部门10和30中工资超过1500的雇员名即工资
SELECT
  ename,
  sal,
  deptno
FROM
  emp
where
  sal > 1500
  and deptno in ('10', '30');
-- 5).显示无管理者的雇员名即岗位
SELECT
  ename,
  job
FROM
  emp
where
  mgr is null;
-- 5.排序数据
  -- 1).显示在1991年2月1日到1991年5月1日之间雇用的雇员名,岗位即雇佣日期,并以雇佣日期进行排序
SELECT
  *
FROM
  emp
where
  hiredate BETWEEN '1991-02-01'
  and '1991-05-01'
order by
  hiredate;
-- 2).显示获得补助的所有雇员名,工资及补助,并以工资降序排序
SELECT
  ename,
  sal,
  comm
FROM
  emp
where
  comm is not null
order by
  sal desc;