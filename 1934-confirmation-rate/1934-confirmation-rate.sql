# Write your MySQL query statement below
-- SELECT 
--     s.user_id,
--     ROUND(
--         IFNULL(SUM(c.action = 'confirmed') / COUNT(c.user_id), 0),
--         2
--     ) AS confirmation_rate
-- FROM Signups s
-- LEFT JOIN Confirmations c
-- ON s.user_id = c.user_id
-- GROUP BY s.user_id;

select s.user_id , round(avg(if(action = 'confirmed',1,0)),2) as confirmation_rate 
from Signups s
left join Confirmations c
on s.user_id = c.user_id
group by s.user_id