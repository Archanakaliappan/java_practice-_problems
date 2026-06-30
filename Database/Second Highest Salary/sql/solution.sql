# Write your MySQL query statement below
SELECT Max(Salary) AS SecondHighestSalary
FROM Employee
WHERE salary<(SELECT max(salary) FROM Employee);