-- Last updated: 9/15/2025, 8:38:42 PM
# Write your MySQL query statement below
select eu.unique_id,e.name 
from
Employees e
left join
EmployeeUNI eu
ON e.id=eu.id;