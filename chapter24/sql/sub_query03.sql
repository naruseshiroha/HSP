-- 查找每个部门工资高于本部门平均工资的人的资料
SELECT
  *
FROM
  emp,(
    SELECT
      AVG(sal) avg_sal,
      deptno
    FROM
      emp
    GROUP BY
      deptno
  ) temp
where
  emp.sal > avg_sal
  and emp.deptno = temp.deptno;
-- 查找每个部门工资最高的人的详细资料
SELECT
  *
FROM
  emp
where
  (sal, deptno) in (
    SELECT
      MAX(sal) sal,
      deptno
    FROM
      emp
    group by
      deptno
  );
-- 查询每个部门的信息(包括：部门名,编号,地址)和人员数量
SELECT
  dept.*,
  num
FROM
  dept,(
    SELECT
      COUNT(*) num,
      deptno
    FROM
      emp
    GROUP BY
      deptno
  ) temp
where
  dept.deptno = temp.deptno;