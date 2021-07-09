-- CHARSET(str) 返回字串字符集
SELECT
  charset(ename)
FROM
  emp;
-- CONCAT (string2 [,... ]) 连接字串, 将多个列拼接成一列
SELECT
  CONCAT(ename, ' 工作是 ', job)
FROM
  emp;
-- INSTR (string ,substring ) 返回 substring 在 string 中出现的位置(索引1开始),没有返回 0
SELECT
  INSTR('linuxun', 'xun');
-- UCASE (string2 ) 转换成大写
SELECT
  UCASE('Linux');
-- LCASE (string2 ) 转换成小写
SELECT
  LCASE('Linux');
-- LEFT (string2 ,length )从 string2 中的左边起取 length 个字符
SELECT
  LEFT('Linuxun', 5);
-- RIGHT (string2 ,length )从 string2 中的右边起取 length 个字符
SELECT
  RIGHT('Linuxun', 3);
-- LENGTH (string )string 长度[按照字节]
SELECT
  LENGTH('Linux洵');
-- REPLACE (str ,search_str ,replace_str ) 在 str 中用 replace_str 替换 search_str
  -- 如果是 manager 就替换成 经理
SELECT
  ename,
  REPLACE(job, 'MANAGER', '经理')
FROM
  emp;
-- STRCMP (string1 ,string2 )逐字符比较两字串大小 -1 小, 0 等, 1 大
SELECT
  STRCMP('lxb', 'lxa');
-- SUBSTRING (str , position [,length ]) 从 str 的 position 开始【从 1 开始计算】,取 length 个字符
  -- 从 ename 列的第一个位置开始取出 2 个字符
SELECT
  SUBSTRING(ename, 1, 2)
from
  emp;
-- LTRIM (string2 ) RTRIM (string2 ) 去除前端空格或后端空格, TRIM(string2) 去除两端空格
SELECT
  LTRIM(' Tokyo '),
  RTRIM(' Tokyo '),
  TRIM(' Tokyo ');
-- 练习: 以首字母小写的方式显示所有员工 emp 表的姓名
SELECT
  CONCAT(
    LCASE(SUBSTRING(ename, 1, 1)),
    SUBSTRING(ename, 2)
  )
FROM
  emp;
SELECT
  CONCAT(LCASE(LEFT(ename, 1)), SUBSTRING(ename, 2))
FROM
  emp;