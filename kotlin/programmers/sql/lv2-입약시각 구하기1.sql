-- 코드를 입력하세요
SELECT to_number(to_char(datetime, 'HH24')) as hour, count(to_number(to_char(datetime, 'HH24'))) as count from animal_outs group by to_number(to_char(datetime, 'HH24')) having to_number(to_char(datetime, 'HH24')) between 9 and 19 order by hour