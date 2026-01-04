# Write your MySQL query statement below
select es.unique_id , e.name from Employees as e
Left join EmployeeUNI as es
on e.id = es.id