-- 还原ecshop数据库
Source ecshop.sql;
-- 备份数据库
mysqldump - u root - p - B ecshop > sql \ ecshop_bak.sql;
-- 删除,还原数据库
DROP DATABASE IF EXISTS ecshop;
Source d:\hsp\chapter24\sql\ecshop_bak.sql;