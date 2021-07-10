-- unique
CREATE table t21(
  id int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(32),
  num_card varchar(18) UNIQUE
);
INSERT INTO
  t21
VALUES
  -- (1, 'zs', '430521199904102860');
  (2, 'zs', '430521199904102860');
-- 如果没有指定 not null,则 unique 字段可以有多个 null
  --unique not null 效果类似 primary key
INSERT INTO
  t21(`name`, num_card)
VALUES
  ('ls', null),('ww', null);
-- 一张表可以有多个 unqie 字段
  CREATE table t21(
    id int UNIQUE not NULL,
    `name` varchar(32),
    num_card varchar(18) UNIQUE
  );