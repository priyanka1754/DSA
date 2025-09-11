https://leetcode.com/problems/rank-scores/
select score,dense_rank() over(order by score desc) as "Rank" from scores

https://leetcode.com/problems/second-highest-salary/
select max(salary) SecondHighestSalary from Employee where salary<(select max(salary) from employee);

https://leetcode.com/problems/combine-two-tables/
select p.firstName,p.lastName,a.city,a.state from Person p left join Address a on p.personId=a.personId 

https://leetcode.com/problems/consecutive-numbers/
select distinct l1.num as ConsecutiveNums from Logs l1,Logs l2,Logs l3 where l1.id=l2.id-1 and l2.id=l3.id-1 and l1.num=l2.num and l2.num=l3.num

https://leetcode.com/problems/employees-earning-more-than-their-managers/
select e.name as "Employee" from employee e join employee m on e.managerId=m.Id and e.salary>m.salary

https://leetcode.com/problems/duplicate-emails/
select email from person group by email having  count(email)>1

https://leetcode.com/problems/customers-who-never-order/
select c.name as Customers from customers c left join orders o on c.id=o.customerId where o.customerId is null
