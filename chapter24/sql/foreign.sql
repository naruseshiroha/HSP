-- foreign key
-- 1.外键指向的表的字段,要求是 primary key 或者是 unique 字段
-- 2.表的类型必须是 INNODB,这样的表才支持外键
-- 3.外键字段的类型要和主键字段的类型一致(长度可以不同)
-- 4.外键字段的值,必须在主键字段中出现过,或者为 null[前提是外键字段允许为null]
-- 5.一旦建立主外键的关系,数据不能随意删除了
-- FOREIGN KEY(本表字段名) REFERENCES 主表名(主键名或UNIQUE字段名)
create table my_class(
  id INT PRIMARY KEY AUTO_INCREMENT,
  `name` VARCHAR(32) NOT NULL
);
INSERT INTO
  my_class
VALUES
  (1, 'java'),(2, 'web');
CREATE table my_stu(
    id INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(32) NOT NULL,
    class_id int UNIQUE not NULL,
    FOREIGN KEY (class_id) REFERENCES my_class(id)
  );
INSERT INTO
  my_stu
VALUES
  -- (3, 'John', 3); my_class 没有3
  (1, 'tom', 1),(2, 'jack', 2);