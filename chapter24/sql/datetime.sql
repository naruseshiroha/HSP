create table t12(
  birthday date,
  job_time DATETIME,
  login_time TIMESTAMP not NULL DEFAULT CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP
);
INSERT INTO
  t12(birthday, job_time)
VALUES
  ('2022-12-12', '2022-11-11 11:11:11');
SELECT
  *
FROM
  t12;
-- 更新时 login_time 会自动更新
update
  t12
set
  birthday = '1111-11-11'
where
  job_time = '2022-11-11 11:11:11';