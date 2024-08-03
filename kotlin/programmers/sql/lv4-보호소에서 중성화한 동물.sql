SELECT i.animal_id, i.animal_type, i.name from animal_ins i left join animal_outs o on(i.animal_id = o.animal_id) where i.sex_upon_intake <> o.sex_upon_outcome order by animal_id