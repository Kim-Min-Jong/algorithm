-- 코드를 입력하세요
select flavor from (SELECT f.flavor, sum(f.total_order + j.total_order) from first_half f, july j where f.flavor = j.flavor group by f.flavor order by 2 desc) where rownum <= 3