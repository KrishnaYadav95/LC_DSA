# Write your MySQL query statement below

SELECT v.customer_id,
       COUNT(v.visit_id) AS count_no_trans 
from
Visits v left join Transactions t on v.visit_id= t.visit_id where 
t.visit_id IS NULL
GROUP BY v.customer_id;


-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna