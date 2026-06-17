# Write your MySQL query statement below
SELECT *
FROM Users
WHERE mail REGEXP BINARY '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$';