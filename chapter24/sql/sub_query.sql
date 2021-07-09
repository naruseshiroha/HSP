-- 显示与 SMITH 同一部门的所有员工
SELECT
  *
FROM
  emp
where
  deptno = (
    SELECT
      deptno
    from
      emp
    where
      ename = 'SMITH'
  );
-- 查询和部门10的工作相同的雇员的名字、岗位、工资和部门号,但是不含10号部门自己的雇员
SELECT
  *
FROM
  emp
where
  deptno != 10
  and job in (
    SELECT
      job
    FROM
      emp
    where
      deptno = 10
  );
-- 查询 ecshop 中各个类别中,价格最高的商品 子查询当做临时表
  use ecshop;
SELECT
  goods_id,
--   ecs_goods.cat_id,
  cat_name,
  goods_name,
  shop_price
FROM
  (
    SELECT
      cat_id,
      MAX(shop_price) max_price
    FROM
      ecs_goods
    GROUP BY
      cat_id
  ) temp
  join ecs_goods on temp.cat_id = ecs_goods.cat_id
  and temp.max_price = ecs_goods.shop_price
  left join ecs_category on ecs_goods.cat_id = ecs_category.cat_id