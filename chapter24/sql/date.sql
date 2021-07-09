-- CURRENT_DATE() 当前日期
-- CURRENT_TIME() 当前时间
-- CURRENT_TIMESTAMP() 当前时间戳
-- DATE (datetime) 返回datetime的日期部分
-- DATE_ADD(date2, INTERVAL d_valued_type) 在date2中加上日期或时间
-- DATE_SUB(date2, INTERVAL d_valued_type) 在date2中加上日期或时间
-- 1.d_valued_type 可以是 YEAR MONTH DAY HOUR MINUTE SECOND
-- DATEDIFF(date1,date2) 两个日期差(结果天)
-- 2.date1-date2 的天数,可以为负数
-- 3.以上4个函数的日期类型可以是 date,datetime,timestamp
-- TIMEDIFF(date1,date2) 两个时间差(结果 HH:mm:ss)
-- NOW() 当前时间
-- YEAR|MONTH|DATE(datetime) 年月日
-- FROM_UNIXTIME() 返回的是 1970-1-1 到现在的秒数
-- 创建测试表 信息表
CREATE TABLE mes(
  id INT PRIMARY KEY,
  content VARCHAR(30),
  send_time DATETIME
);
-- 添加一条记录
INSERT INTO
  mes
VALUES(1, '北京新闻', CURRENT_TIMESTAMP());
INSERT INTO
  mes
VALUES(2, '上海新闻', NOW());
INSERT INTO
  mes
VALUES(3, '广州新闻', NOW());
SELECT
  *
FROM
  mes;
SELECT
  NOW();
-- 显示所有新闻信息，发布日期只显示 日期，不用显示时间.
SELECT
  DATE(send_time)
FROM
  mes;
-- 请查询在 10 分钟内发布的新闻, 思路一定要梳理一下.
SELECT
  *
FROM
  mes
where
  --   DATE_ADD(send_time, INTERVAL 10 MINUTE) >= NOW();
  send_time >= DATE_SUB(NOW(), INTERVAL 10 MINUTE);
-- 请在 mysql 的 sql 语句中求出 2011-11-11 和 1990-1-1 相差多少天
SELECT
  DATEDIFF('2011-11-11', '1990-1-1');
-- 请用 mysql 的 sql 语句求出你活了多少天? [练习] 1986-11-11 出生
SELECT
  DATEDIFF(NOW(), '1986-11-11');
-- 如果你能活 80 岁，求出你还能活多少天.[练习] 1986-11-11 出生
SELECT
  DATEDIFF(DATE_ADD('1986-11-11', INTERVAL 80 YEAR), NOW());
SELECT
  TIMEDIFF('10:11:11', '06:10:10');
SELECT
  YEAR(NOW()),
  MONTH(NOW()),
  DAY(NOW());
-- FROM_UNIXTIME() : 可以把一个 unix_timestamp 秒数[时间戳]，转成指定格式的日期
  -- %Y-%m-%d %H:%i:%s 格式是规定好的，表示年月日 时分秒
  -- 意义：在开发中，可以存放一个整数，然后表示时间，通过 FROM_UNIXTIME 转换
SELECT
  FROM_UNIXTIME(UNIX_TIMESTAMP(), '%Y-%m-%d %H:%i:%s');
SELECT
  *
FROM
  mysql.user;