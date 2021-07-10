-- AUTO_INCREMENT
-- 1.一般来说自增长适合 primary key 配合使用的
-- 2.自增长也可以单独使用[但是需要配合一个 unique]
-- 3.自增长修饰的字段为整数型(虽然小鼠也可以,但是非常非常少使用)
-- 4.自增长默认从1开始,也可以通过如下命令修改
-- 5.如果你添加数据时,给自增长字段(列)指定的有值,则以指定的值为准,如果制定了自增长,一般来说,就按照自增长的规则来添加数据
COLUMN datatype PRIMARY KEY AUTO_INCREMENT;
CREATE table t24(
  id int PRIMARY KEY AUTO_INCREMENT,
  `name` VARCHAR (32) NOT NULL,
  `email` VARCHAR (32) NOT NULL
);
INSERT INTO
  t24
VALUES
  (null, 'tom', 'tom@qq.com');
SELECT
  *
FROM
  t24;
-- 修改自增长的开始值
  CREATE table t25(
    id int PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR (32) NOT NULL,
    `email` VARCHAR (32) NOT NULL
  );
alter table
  t25 AUTO_INCREMENT = 100;
INSERT INTO
  t25
VALUES
  (666, 'john', 'john.sql'),(null, 'john', 'john.sql');
SELECT
  *
FROM
  t25;