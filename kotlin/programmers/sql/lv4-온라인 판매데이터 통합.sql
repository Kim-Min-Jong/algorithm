SELECT to_char(sales_date,'YYYY-MM-DD'), product_id, user_id, sales_amount from online_sale where to_char(sales_date, 'YYYY-MM') = '2022-03'
union
SELECT to_char(sales_date,'YYYY-MM-DD'), product_id, null, sales_amount from offline_sale where to_char(sales_date, 'YYYY-MM') = '2022-03'
order by 1, 2, 3