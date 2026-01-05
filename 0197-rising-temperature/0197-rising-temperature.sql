# Write your MySQL query statement below
-- select w1.id from Weather as w1 
-- join Weather as w2
-- where datediff(w1.recordDate,w2.recordDate) =1
--   and w2.temperature <w1.temperature

select w1.id from Weather as w1
 join Weather as w2
on w1.recordDate = date_add(w2.recordDate, interval 1 day)
where w1.temperature > w2.temperature