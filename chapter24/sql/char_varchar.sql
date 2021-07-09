-- CHAR(size) 固定长度字符串,最大 255 字符
-- VARCHAR(size) 0~65535字节,可变长度字符串, [utf8编码最大21844字符 1-3 个字节用于记录大小]
-- 如果表的编码是 utf8 varchar(size) size=(65535-3)/3=21844
-- 如果表的编码是 gbk varchar(size) size=(65535-3)/2=32766
CREATE Table t7(`name` CHAR (255));
CREATE Table t8(`name` VARCHAR (32766) charset gbk);
DROP table t8;