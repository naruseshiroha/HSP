-- IF(expr1,expr2,expr3) 如果 expr1 为 T,返回 expr2,否则返回 expr3
SELECT
  IF(true, 'tokyo', 'shibuya');
-- IFNULL(expr1,expr2) 如果 expr1 不为 NULL,则返回 expr1,否则返回 expr2
SELECT
  IFNULL('japan', 'tokyo');
-- SELECT CASE WHERE expr1 THEN expr2 WHEN expr3 THEN expr4 ELSE expr5 END;
  --如果 expr1 为 T,则返回 expr2,如果 expr2 为 T,则返回 expr4,否则返回 expr5
SELECT
  case
    when true then 'jack'
    when false then 'tom'
    else 'mary'
  end;
-- 1.查询 emp 表,如果 comm 是 null,则显示 0.0
SELECT
  --   IF(comm is null, 0.0, comm)
  IFNULL(comm, 0.0)
from
  emp;
-- 2. 如果 emp 表的 job 是 CLERK 则显示 职员， 如果是 MANAGER 则显示经理
  --如果是 SALESMAN 则显示 销售人员，其它正常显示
SELECT
  (
    case
      when job = 'CLERK' then '职员'
      when job = 'MANAGER' then '经理'
      when job = 'SALESMAN' then '销售人员'
      else job
    end
  ) job
FROM
  emp;