CREATE table stu(id int, `name` varchar(32));
INSERT INTO
  stu
VALUES
  (1, 'tom'),(2, 'jack'),(3, 'kitty'),(4, 'john');
create table exam(id int, grade int);
INSERT INTO
  exam
VALUES
  (1, 56),(2, 76),(5, 99);
-- 显示所有人的成绩，如果没有成绩，也要显示该人的姓名和 id 号,成绩显示为空
SELECT
  stu.*,
  grade
FROM
  stu
  LEFT join exam on stu.id = exam.id;
-- 显示所有成绩，如果没有名字匹配，显示空
SELECT
  `name`,
  exam.*
FROM
  stu
  RIGHT join exam on stu.id = exam.id;
-- 列出部门名称和这些部门的员工名称和工作,同时要求 显示出那些没有员工的部门。
SELECT
  dept.deptno,
  dname,
  ename,
  job
FROM
  emp
  RIGHT JOIN dept ON emp.deptno = dept.deptno;