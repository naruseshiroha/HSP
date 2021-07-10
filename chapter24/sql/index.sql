-- index
-- 没有索引为什么会慢? 因为全表扫描
-- 使用索引为什么会快? 形成一个索引的数据结构,比如二叉树
-- 索引的代价
-- 1.磁盘占用
-- 2.对DML(update delete insert)语句的效率影响
use index_bk;
SELECT
  COUNT(*)
FROM
  emp;
-- 在没有创建索引时,我们的查询一条记录
-- 4600ms 1ms
SELECT
  *
FROM
  emp
where
--   empno = 1234568;
  ename = 'axjxcs';
  -- 使用索引优化一下,体验索引的NB
  -- 在没有创建索引前,emp.idb 文件大小 512M
  -- 创建empno索引后,emp.idb 文件大小 640M[索引本身也会占用空间]
  -- 创建ename索引后,emp.idb 文件大小 808M[索引本身也会占用空间]
  -- empno_index 索引名称
  -- ON emp(empno): 表示在 emp 表的 empno 列创建索引
  CREATE INDEX empno_index on emp(empno);
  CREATE INDEX ename_index on emp(ename);