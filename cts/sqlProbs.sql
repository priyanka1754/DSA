https://leetcode.com/problems/rank-scores/
select score,dense_rank() over(order by score desc) as "Rank" from scores

https://leetcode.com/problems/second-highest-salary/
select max(salary) SecondHighestSalary from Employee where salary<(select max(salary) from employee);
