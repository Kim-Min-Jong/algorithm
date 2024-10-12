SELECT cart_id from cart_products where name = 'Milk'
intersect
SELECT cart_id from cart_products where name = 'Yogurt';