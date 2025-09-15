-- Last updated: 9/15/2025, 8:38:36 PM
# Write your MySQL query statement below
SELECT u.name, SUM(t.amount) AS balance
FROM Users u
JOIN Transactions t
    ON u.account = t.account
GROUP BY u.account, u.name
HAVING SUM(t.amount) > 10000;
