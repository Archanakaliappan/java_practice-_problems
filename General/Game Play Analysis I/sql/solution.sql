1# Write your MySQL query statement below
2SELECT player_id,Min(event_date) AS first_login
3FROM Activity
4GROUP BY player_id;