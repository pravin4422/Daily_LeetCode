-- -- # Write your MySQL query statement below
-- SELECT e1.name
-- FROM Employee e1
-- JOIN (
--     SELECT managerId
--     FROM Employee
--     GROUP BY managerId
--     HAVING COUNT(managerId) >= 5
-- ) e
-- ON e1.id = e.managerId;

SELECT e.name
FROM Employee e
JOIN (
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(*) >= 5
) t
ON e.id = t.managerId;
