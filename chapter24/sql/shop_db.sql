-- 现有一个商店的数据库 shop_db，记录客户及其购物情况，由下面三个表组成：
-- 商品 goods（商品号 goods_id，商品名 goods_name，单价 unitprice，商品类别 category，
-- 供应商 provider);
-- 客户 customer（客户号 customer_id,姓名 name,住址 address,电邮 email 性别 sex,身份证 card_Id);
-- 购买 purchase（购买订单号 order_id，客户号 customer_id,商品号 goods_id,购买数量 nums);
-- 1 建表，在定义中要求声明 [进行合理设计]：
-- (1)每个表的主外键；
-- (2)客户的姓名不能为空值；
-- (3)电邮不能够重复;
-- (4)客户的性别[男|女] check 枚举..
-- (5)单价 unitprice 在 1.0 - 9999.99 之间 check
create database shop_db;
use shop_db;
drop database shop_db;
create Table goods(
  goods_id int PRIMARY KEY AUTO_INCREMENT,
  goods_name varchar(32) not null,
  unitprice decimal(10, 2) not null check(
    unitprice BETWEEN 1.0
    AND 9999.99
  ),
  category varchar(32) not null,
  provide VARCHAR (32) not null
);
create table customer(
  customer_id int PRIMARY KEY AUTO_INCREMENT,
  `name` VARCHAR (32) not null,
  `address` VARCHAR (64) not null,
  emial VARCHAR(32) not NULL UNIQUE,
  -- sex char(1) check(sex in ('男', '女')),
  sex ENUM('男', '女') not null,
  card_id CHAR (18) not null
);
CREATE table purchase(
  order_id int UNSIGNED PRIMARY KEY AUTO_INCREMENT,
  customer_id int,
  goods_id int,
  nums int not null,
  foreign key(customer_id) REFERENCES customer(customer_id),
  foreign key(goods_id) REFERENCES goods(goods_id)
);