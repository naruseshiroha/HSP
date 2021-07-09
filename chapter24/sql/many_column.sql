-- 查询与 ALLEN 的部门和岗位完全相同的所有雇员(并且不含 ALLEN 本人)
SELECT
  *
FROM
  emp
where
  ename != 'ALLEN'
  AND (job, deptno) = (
    SELECT
      job,
      deptno
    FROM
      emp
    where
      ename = 'ALLEN'
  );
-- 查询 和宋江数学，英语，语文成绩 完全相同的学生
SELECT
  *
FROM
  student
where
  `name` != '宋江'
  AND (chinese, english, math) = (
    SELECT
      chinese,
      english,
      math
    FROM
      student
    where
      `name` = '宋江'
  );