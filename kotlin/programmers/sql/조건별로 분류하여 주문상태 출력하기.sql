SELECT order_id, product_id, to_char(out_date,'YYYY-MM-DD'),
    case when to_date(20220501,'YYYY-MM-DD') < out_date then '출고대기'
        when to_date(20220501,'YYYY-MM-DD') >= out_date then '출고완료'
        else '출고미정' 
        end
from food_order

order by order_id asc