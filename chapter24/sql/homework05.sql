create database homework;
use homework;
-- 8.设学校环境如下:一个系有若干个专业,每个专业一年只招一个班,每个班有若干个学生.现要建立关于系、学生、班级的数据库,关系模式为:
-- 班CLASS:(classid,subject,deptname,enrolltime,num)
-- 学生STUDENT:(studentid,name,age,classid)
-- 系DEPARTMENT:(departmentid,depatname)
-- 1.建表
-- 1).每个表的主外键
-- 2).deptname是唯一约束
-- 3).学生姓名不能为空
create table `department`(
  departmentid int PRIMARY KEY AUTO_INCREMENT,
  deptname varchar(16) UNIQUE
);
create table `class`(
  classid int PRIMARY KEY AUTO_INCREMENT,
  `subject` varchar(16),
  deptname varchar(16),
  enrolltime int,
  num int,
  FOREIGN KEY (deptname) REFERENCES department(deptname)
);
create table `student`(
  studentid int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(32) not null,
  age int check(
    age between 0
    and 120
  ),
  classid int,
  foreign key (classid) REFERENCES class(classid)
);
-- 2.插入如下数据
INSERT INTO
  department(deptname)
VALUES
  ('数学'),('计算机'),('化学'),('中文'),('经济');
INSERT INTO
  `class`
VALUES
  (101, '软件', '计算机', 1995, 20),
  (102, '微电子', '计算机', 1996, 30),
  (111, '无机化学', '化学', 1995, 29),
  (112, '高分子化学', '化学', 1996, 25),
  (121, '统计数学', '数学', 1995, 20),
  (131, '现代语言', '中文', 1996, 20),
  (141, '国际贸易', '经济', 1997, 30),
  (142, '国际金融', '经济', 1996, 14);
INSERT INTO
  student
VALUES
  (8101, '张三', 18, 101),
  (8102, '钱四', 16, 121),
  (8103, '王玲', 17, 131),
  (8105, '李飞', 19, 102),
  (8109, '赵四', 18, 141),
  (8110, '李可', 20, 142),
  (8201, '张飞', 18, 111),
  (8302, '周瑜', 16, 112),
  (8203, '王亮', 17, 111),
  (8305, '董庆', 19, 102),
  (8409, '赵龙', 18, 101),
  (8510, '李丽', 20, 142);
-- 3.
  -- 1).找出所有姓李的学生
SELECT
  *
FROM
  student
where
  left(`name`, 1) = '李';
-- 2).列出所有开设超过一个专业的系的名字
SELECT
  deptname,
  COUNT(deptname) num
FROM
  class
group by
  deptname
having
  num > 1;
-- 3).找出人数大于等于30的系的编号和名字
SELECT
  departmentid,
  d.deptname,
  SUM(num) num
FROM
  class c,
  department d
where
  d.deptname = c.deptname
group by
  d.departmentid
having
  num >= 30;
-- 4).血小增加了一个物理系,编号为 6
INSERT INTO
  department
VALUES
  (null, '物理');
-- 5).张三退学,请更新相关的表
  start transaction;
update
  class
set
  num = num - 1
where
  classid = (
    SELECT
      classid
    FROM
      student
    where
      `name` = '张三'
  );
DELETE FROM
  student
where
  `name` = '张三';
commit;
SELECT
  *
FROM
  student
where
  `name` = '张三';