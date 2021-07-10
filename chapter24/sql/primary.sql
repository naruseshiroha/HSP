-- primary key
CREATE table t17(
  id int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(32),
  email varchar(32)
);
-- 1.prrimary key 不能重复而且不能为 null
INSERT INTO
  t17
VALUES
  -- (2, 'ww', 'ww@qq.com'),(null, 'zl', 'zl@qq.com');
  (1, 'zs', 'zs@qq.com'),(2, 'ls', 'zs@zs.com');
-- 2.一张表最多只能有一个主键,但可以是复合主键
  CREATE table t18(
    id int AUTO_INCREMENT,
    `name` varchar(32),
    email varchar(32),
    PRIMARY key(id, `name`)
  );
INSERT INTO
  t18
VALUES
  -- (1, 'zs', 'lisi@qq.com');
  (1, 'zs', 'zs@qq.com'),(2, 'ls', 'zs@zs.com');
-- 3.主键的指定方式 有两种
  --直接在字段名后指定: filed primary key
  --在表定义最后写: primary key(filed)
  CREATE table t19(
    id int PRIMARY KEY AUTO_INCREMENT,
    `name` varchar(32),
    email varchar(32)
  );
CREATE table t20(
    id int AUTO_INCREMENT,
    `name` varchar(32),
    email varchar(32),
    PRIMARY KEY (id)
  );
-- 4.使用 DESC 表名,可以看到 primary key 的情况
  desc t18;