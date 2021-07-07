-- 1.
-- char(4) 最大255,4 表示字符数,不是字节数,不管是中文还是字母都是放 4 个,按字符计算
-- varchar(4) 4 表示字符数,不管是字母还是中文都以定义好的表的编码来存放数据,最多 存放 4 个,按照字符来存放
-- 2.
-- char(4) 是定长(固定的大小),就是说,即使你插入 'aa',也会占用分配的 4 个字符的空间
-- varchar(4) 是变长(变化的大小),就是说,即使你插入 'aa',实际占用空间大小并不是 4 个字符,而是按照实际占用空间来分配
----(varchar 本身还需要占用 1-3 个字节来记录存放内容长度) L(实际数据大小) + (1-3)字节
-- 3.什么时候使用 char,什么时候使用 varchar  查询速度: char > varchar
-- 如果数据是定长,推荐使用 char,比如 md5 的密码(char(32)),右边,手机号,身份证号码等
-- 如果一个字段的长度是不确定,我们使用 varchar,比如留言,文章
-- 4
-- TEXT 0~2^16 字节, 如果希望存放更多字符,可以选择 MEDIUMTEXT 0~2^24, LONGTEXT 0~2^32
CREATE table t9(name char(4));
INSERT INTO
  t9
VALUES
  ('liux');
SELECT
  *
FROM
  t9;
CREATE table t10 (name varchar(4));
INSERT INTO
  t10
VALUES
  ('wd你好'),('世界你好');
SELECT
  *
FROM
  t10;
CREATE table t11(
    content TEXT,
    content2 MEDIUMTEXT,
    content3 LONGTEXT
  );
INSERT INTO
  t11
VALUES
  ('lx', 'lixun', 'Linuxlixun');
SELECT
  *
FROM
  t11;