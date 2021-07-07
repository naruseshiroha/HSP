-- 备份数据库
mysqldump - u [root] - p - B [database] > [filename].sql;
-- 恢复数据库
source [filename].sql;