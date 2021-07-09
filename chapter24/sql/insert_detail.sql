-- 1.插入的数据应与字段的数据类型相同
INSERT INTO
  goods
VALUES
  (1.1, 'iphone12', 10999);
-- 2.数据的长度应在列的规定范围内
INSERT INTO
  goods
VALUES
  (3, 'one plus one plus one plus one plus', 4999);
desc goods;
-- 3.在 values 中列出的数据位置必须与被加入的列的排列位置相对应
INSERT INTO
  goods(id, goods_name, price)
VALUES
  ('坚果pro', 4, 3999);
-- 4.字符和日期型数据应包含在单引号中
INSERT INTO
  goods
VALUES
  (5, 三 星 s21, 8999);
-- 5.列可以插入空值[前提是该字段允许为空]
INSERT INTO
  goods
VALUES
  (6, 'xperia Ⅳ', null);
-- 6.insert into [tablename](列名...) values(),(); 添加多条记录
INSERT INTO
  goods(id, goods_name, price)
VALUES
  (3, 'iphone13', 10999),(4, '三星s21', 8999);
-- 7.如果是给表中的所有字段添加数据,可以不写前面的列名
INSERT INTO
  goods
VALUES
  (5, 'One Plus 9 pro', 4999);
-- 8.默认值的使用,当不给某个字段值时,如果有默认值就会自动添加,否则 不为空 就会报错
  --如果某个列没有指定 not null,那么当添加数据时,没有给定值,则会默认为 NULL
  --如果我们希望指定某个列的默认值,可以在创建表时指定
  create table t_goods(
    id int PRIMARY KEY AUTO_INCREMENT,
    goods_name varchar(50),
    price double DEFAULT 9999
  );
INSERT INTO
  t_goods(id, goods_name)
VALUES
  (1, 'xperia Ⅳ');
SELECT
  *
FROM
  t_goods;