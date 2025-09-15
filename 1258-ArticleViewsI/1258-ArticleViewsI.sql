-- Last updated: 9/15/2025, 8:38:50 PM
# Write your MySQL query statement below
SELECT distinct author_id as id from Views
where author_id=viewer_id
order by id asc;