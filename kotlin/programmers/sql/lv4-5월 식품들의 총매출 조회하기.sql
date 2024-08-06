SELECT p.product_id, p.product_name, sum(o.amount) * max(p.price) 
from food_product p inner join food_order o on(p.product_id = o.product_id) 
where to_char(o.produce_date,'YYYYMM') = '202205' 
group by p.product_id, p.product_name 
order by  sum(o.amount) * max(p.price) desc, p.product_id asc