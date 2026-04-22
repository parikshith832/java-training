create database company;
use company;
create table employee(emp_id int primary key,
name varchar(50),department varchar(50),salary int,joining_date varchar(10));
desc employee;
insert into employee values
(1,'Amit','IT',5000,'2022-01-10'),
(2,'Sam','HR',5100,'2021-04-13'),
(3,'Ram','IT',3400,'2017-05-15'),
(4,'Ron','Finance',6000,'2019-01-05'),
(5,'Ave','IT',8000,'2022-02-16'),
(6,'Eve','Hr',5500,'2021-09-10');
select * from employee;	
#having
select department,sum(salary) as total_sale
from employee
group by department
having sum(salary)>10000;

#view

CREATE view res as 
select * from employee
where department="IT";


select * from res;


select name,department,salary,
ROW_NUMBER() over(partition by department order by salary desc) as rown
from employee;


select name,salary,
(rank() over(order by salary desc)) as rankf
from employee;


create index idx_salary
on employee(salary);
select * from employee
where salary>5000;