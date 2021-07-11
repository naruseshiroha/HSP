-- 1.创建一张订单表 order(id,goods_name,custome,num) id 主键
CREATE table order1(
  id int PRIMARY KEY AUTO_INCREMENT,
  goods_name varchar(32),
  customer varchar(32),
  num int
);
show index
from
  order1;
CREATE table order2(
    id int,
    goods_name varchar(32),
    customer varchar(32),
    num int
  );
alter table
  order2
add
  primary key(id);
-- 创建一张特价菜谱表menu(id,menuname,chef,card_id,price).要求 id 主键,card_id unique.
  create table menu1(
    id int PRIMARY KEY AUTO_INCREMENT,
    menuname varchar(32),
    chef varchar(32),
    card_id char(18) unique,
    price decimal(10, 2)
  );
show index
from
  menu1;
create table menu2(
    id int PRIMARY KEY AUTO_INCREMENT,
    menuname varchar(32),
    chef varchar(32),
    card_id char(18),
    price decimal(10, 2)
  );
alter table
  menu2
add
  unique index card_index(card_id);
show index
from
  menu2;
-- 创建一张运动员表sportman(id,name,speciality).id 主键,名字为普通索引
  create Table sportman1(
    id int PRIMARY KEY AUTO_INCREMENT,
    `name` varchar(32),
    speciality VARCHAR(32),
    index ind_name (`name`)
  );
CREATE table sportman2(
    id int PRIMARY KEY AUTO_INCREMENT,
    `name` varchar(32),
    speciality VARCHAR(32)
  );
create index ind_name on sportman2(`name`);
CREATE table sportman3(
    id int PRIMARY KEY AUTO_INCREMENT,
    `name` varchar(32),
    speciality VARCHAR(32)
  );
alter table
  sportman3
add
  index ind_name(`name`);
show index
from
  sportman1;