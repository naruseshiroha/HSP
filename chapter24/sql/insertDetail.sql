-- 1.插入的数据应与字段的数据类型相同
-- 2.数据的长度应在列的规定范围内
-- 3.在 values 中列出的数据位置必须与被加入的列的排列位置相对应
-- 4.字符和日期型数据应包含在单引号中
-- 5.列可以插入空值[前提是该字段允许为空]
-- 6.insert into [tablename](列名...) values(),(); 添加多条记录
-- 7.如果是给表中的所有字段添加数据,可以不写前面的列名
-- 8.默认值的使用,当不给某个字段值时,如果有默认值就会自动添加,否则 不为空 就会报错