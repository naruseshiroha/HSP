-- alter table
-- 添加列
ALTER TABLE
  [tablename]
ADD
  ([column] datatype [DEFAULT expr]);
-- 修改列
ALTER TABLE
  [tablename]
MODIFY
  ([column] datatype [DEFAULT expr]);
-- 删除列
ALTER TABLE
  [tablename] DROP ([column]);
-- 查看表的结构
  DESC [tablename];
-- 修改表名
  RENAME table [tablename] to [tablename];
-- 修改表字符集
ALTER TABLE
  [tablename] CHARSET [utf8mb4];
-- 修改列名
ALTER TABLE
  [tablename] CHANGE COLUMN [column] [newColumn datatype];
-- emp 添加 image 列,类型 varchar(50) 要求 resume 后面
alter table
  emp
add
  `image` varchar(50) not null default ''
AFTER
  `resume`;
-- 修改 job 列,长度改为 60
alter table
  emp
modify
  job varchar(60);
-- 删除 gender 列
alter table
  emp drop gender;
-- 表名改为 employee
  rename table emp to employee;
-- 修改表的字符集
alter table
  employee charset utf8mb4;
alter table
  employee change column `username` username varchar(20);
desc employee;