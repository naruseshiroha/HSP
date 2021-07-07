-- 创建一张商品表 goods(id int,goods_name varchar(10),price double)
create table `goods`(
  id int PRIMARY KEY AUTO_INCREMENT,
  goods_name varchar(20),
  price double
) charset utf8mb4 collate utf8mb4_bin engine INNODB;
-- 添加2条记录
INSERT INTO
  `goods`
VALUES
  (1, 'sony xperia Ⅲ', 8999.99),
  (2, 'sharp Aquos R5', 5999.99);
SELECT
  *
FROM
  goods;