-- ABS(num)绝对值
SELECT ABS(-0.618);
-- BIN (decimal_number )十进制转二进制
SELECT BIN(65535);
-- CEILING (number2 ) 向上取整, 得到比 num2 大的最小整数
SELECT CEILING(-1.5),CEILING(1.5);
-- FLOOR (number2 )向下取整,得到比 num2 小的最大整数
SELECT FLOOR(-1.5),FLOOR(1.5);
-- CONV(number2,from_base,to_base)进制转换
-- 下面的含义是 8 是十进制的 8, 转成 2 进制输出
SELECT CONV(15,10,2);
-- 下面的含义是 8 是 16 进制的 8, 转成 2 进制输出
SELECT CONV('FF',16,2);

-- FORMAT (number,decimal_places )保留小数位数(四舍五入)
SELECT FORMAT(3.1415,2);
-- HEX (DecimalNumber )转十六进制
SELECT HEX(255);
-- LEAST (number , number2 [,..])求最小值
SELECT LEAST(1,-1,0);
-- MOD (numerator ,denominator )求余 符号和 第一个数有关
SELECT MOD(-5,-2);
-- RAND([seed]) 返回随机数 其范围为 0 ≤ v ≤ 1.0
-- 1. 如果使用 rand() 每次返回不同的随机数 ，在 0 ≤ v ≤ 1.0
-- 2. 如果使用 rand(seed) 返回随机数, 范围 0 ≤ v ≤ 1.0, 如果 seed 不变，该随机数也不变了
SELECT RAND();