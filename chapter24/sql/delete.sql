-- delete
-- 1.如果不适用 where 子句,将删除表中所有数据
-- 2.Delete 语句不能删除某一列的值(可使用 update 设为 null 或者 '')
-- 3.使用 delete 语句仅删除记录,不删除表本身,如要删除表,使用 drop table语句.drop table 表名;
DELETE FROM
  [tablename] [where where_condition];
-- 删除表中名称为 '小菜鸟' 的记录
DELETE FROM
  employee
where
  username = '小菜鸟';
DELETE FROM
  employee;