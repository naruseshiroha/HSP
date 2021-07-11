-- 1.主键索引,主键自动的为主索引(类型 primary key)
-- 2.唯一索引(UNIQUE)
-- 3.普通索引(INDEX)
-- 4.全文索引(FULLTEXT)[适用于MyISAM] 开发中考虑使用: Solr 和 ElasticSearch
create table t1(
  -- 主键,同时也是索引,称为主键索引
  id int PRIMARY KEY,
  name varchar(32)
);
create table t2(
  -- id 是唯一的,同时也是索引,称为 Unique 索引
  id int unique,
  name varchar(32)
);
-- 1.创建索引
create table t25(id int, `name` varchar(32));
-- 查询表是否有索引
show indexes
from
  t25;
-- 添加索引
  -- unique
  create unique index id_index on t25(id);
-- 普通索引1
  create index id_index on t25(id);
-- 如何选择
  -- 1.如果某列的值,是不会重复的,则优先考虑使用 unique 索引,否则使用普通索引
  -- 普通索引2
alter table
  t25
add
  index id_index(id);
-- 2.添加主键(索引)
  create table t26(id int, `name` varchar(32));
alter table
  t26
add
  primary key(id);
show index
from
  t26;
-- 3.删除索引
  drop index id_index on t25;
-- 4.删除主键索引
alter table
  t26 drop primary key;
-- 修改索引,就是先删除,再添加新的索引
  -- 查询索引
  -- 1.
  SHOW index
from
  t25;
-- 2.
  SHOW indexes
from
  t25;
-- 3.
  show keys
from
  t25;
-- 4.
  desc t25; 