# Write your MySQL query statement below

-- select e.name , ifnull(b.bonus,0) as bonus from Employee as e
-- left join Bonus as b
-- on e.empId = b.empId 
-- where e.salary - ifnull(b.bonus,0) < 1000


SELECT e.name, b.bonus
FROM Employee e
LEFT JOIN Bonus b
ON e.empId = b.empId
WHERE b.bonus IS NULL OR  b.bonus < 1000;



