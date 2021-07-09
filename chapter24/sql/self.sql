-- 查询列需要取别名 e1.ename '职员名', e2.ename '上级名'
-- 显示公司员工名字和他的上级的名字
SELECT
  --   e1.ename '职员名',  e2.ename '上级名'
  e1.ename '职员名',
  e2.ename '上级名'
FROM
  emp e1,
  emp e2
where
  e1.mgr = e2.empno;
SELECT
  e1.ename '员工名',
  e2.ename '上级名'
FROM
  emp e1
  join emp e2 on e1.mgr = e2.empno;