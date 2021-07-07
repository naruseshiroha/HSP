-- 备份数据库
mysqldump - u [root] - p - B [database] > [filename].sql;
-- 备份数据库的表
mysqldump - u [root] [database] [table_name, table_name] > [filename].sql;
-- 恢复数据库
source [filename].sql;