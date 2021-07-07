-- 创建数据库
CREATE database bk_db01;
-- 删除数据库
DROP database bk_db01;
-- 创建一个使用 utf8mb4 字符集的数据库
CREATE database bk_db02 charset utf8mb4;
--创建一个使用  utf8mb4 字符集,并带校对规则的数据库
CREATE database bk_db03 charset utf8 collate utf8_bin;
-- 校对规则 utf8_bin 区分大小写 默认 utf8_general_ci 不区分大小写
CREATE TABLE tbl_t1(
  id INT PRIMARY KEY AUTO_INCREMENT,
  `name` VARCHAR (255)
) DEFAULT CHARSET utf8 COLLATE utf8_bin;
INSERT INTO
  tbl_t1
VALUES
  (1, "tom"),(2, "Tom");
SELECT
  *
FROM
  tbl_t1
where
  `name` = 'Tom';