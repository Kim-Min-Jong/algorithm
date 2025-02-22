-- -- 코드를 입력하세요
with a as (SELECT to_char(datetime, 'HH24') as HH, count(to_char(datetime, 'HH24')) as cnt from animal_outs group by to_char(datetime, 'HH24'))

,b as (SELECT LEVEL - 1 HOUR FROM DUAL CONNECT BY LEVEL <= 24)

select hour, nvl(cnt, 0) from a q, b w where q.hh(+) = w.hour order by hour