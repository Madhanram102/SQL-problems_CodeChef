-- your code goes here
select department,count(employee_id) as total_employees from Employees  group by department;