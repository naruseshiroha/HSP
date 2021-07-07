create table emp(
  id int PRIMARY key AUTO_INCREMENT,
  `name` varchar(32) not null,
  gender char(1) not null,
  birthday date,
  entry_date DATETIME not null,
  job varchar(32) not null,
  salary double not NULL,
  `resume` text not null
) charset utf8mb4 collate utf8mb4_bin engine = INNODB;
DROP table if exists emp;
INSERT INTO
  emp
VALUES
  (
    1,
    'zyy',
    'f',
    '1999-04-10',
    '2020-12-12 13:00:00',
    '园艺师',
    4000,
    '擅长园艺'
  );
SELECT
  *
FROM
  emp
WHERE
  id = 1;