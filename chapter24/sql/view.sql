-- view
-- 1.视图是根据基表(可以是多个)来创建的 视图是虚拟的表
-- 2.视图也有列,数据来自基表
-- 3.通过视图可以修改基表的数据
-- 4.基表的改变,也会影响到视图的数据
-- 创建一个视图 emp_view01,只能查询 emp 表的(empno,ename,job,deptno)
-- 创建视图
create view emp_view01 as
SELECT
  empno,
  ename,
  job,
  deptno
FROM
  emp;
-- 查看视图
  desc emp_view01;
SELECT
  *
FROM
  emp_view01;
-- 查看创建视图的指令
  show create view emp_view01;
-- 删除视图
  drop view emp_view01;
-- detail
  -- 1.创建视图后,到数据库去看,对应视图只有一个视图结构文件(形式:视图名.frm)
  -- 2.使徒的数据变化会影响到基表,基表的数据变化也会影响到视图[DML]
  -- 修改视图
update
  emp_view01
set
  job = "MANAGER"
where
  empno = 7369;
update
  emp
set
  job = "SALESMAN"
where
  empno = 7369;
-- 3.视图中可以再使用视图,从 emp_view01 中选出 empno,ename 做出新视图
  create view emp_view02 as
SELECT
  empno,
  ename
FROM
  emp_view01;