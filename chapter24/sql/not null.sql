-- not null,插入数据时必须为列提供数据
COLUMN datatype NOT NULL;
show tables;
CREATE table t16(
  id INT PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  emial varchar(32)
);
INSERT INTO
  t16
VALUES
  -- (1, null, NULL);
  (1, 'zs', NULL);