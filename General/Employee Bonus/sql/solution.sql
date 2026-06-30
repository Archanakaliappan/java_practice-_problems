1# Write your MySQL query statement below
2SELECT Employee.name,Bonus.bonus
3FROM Employee
4LEFT JOIN BONUS 
5ON Employee.empId=Bonus.empId
6WHERE Bonus.bonus<1000 OR Bonus.bonus IS NULL;