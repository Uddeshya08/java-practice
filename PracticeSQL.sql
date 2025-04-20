TOPICS COVERED  -  GROUP BY, ORDER BY,
1. get count of department for employee
select department_name, count(department_name) from employee group by department_name;

2. AVG salary per department
  select department_name, avg(salary) from employee group by department_name;

3. Minimum and Maximum salary
select department_name, min(salary), max(salary) from employee group by department_name

4. Order by highest avg salary department
select department_name, avg(salary) from employee group by department_name
order by avg(salary) DESC
