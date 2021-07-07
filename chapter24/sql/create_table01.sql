create table [name](
  id int NOT NULL primary key AUTO_INCREMENT comment 'primary key',
  create_time DATETIME COMMENT 'create time',
  update_time DATETIME COMMENT 'update time',
  [column] varchar(255) comment '',
  --   [filed] datatype comment ''
) default charset [utf8] comment '字符集' collate [utf8_bin] comment '校对规则';
-- filed 列名 datatype 指定列类型(字段类型)
-- charset: 如不指定则为所在数据库字符集
-- collate: 如不指定则为所在数据库校对规则
-- engine: 引擎
--
create table `t_user`(
  id int PRIMARY KEY auto_increment COMMENT 'primary key',
  `name` varchar(255) COMMENT 'name',
  `password` varchar(255) COMMENT 'password',
  `birthday` datetime COMMENT 'birthday',
  create_time DATETIME default CURRENT_TIMESTAMP COMMENT 'create time',
  update_time DATETIME COMMENT 'update time'
) default charset utf8 collate utf8_bin engine INNODB;
--


INSERT INTO
  t2
VALUES
  (-1);