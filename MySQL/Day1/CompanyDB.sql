create database CompanyDB;
use CompanyDB;
create table Departments(
dept_id int primary key,dept_name varchar(50));
create table Employees(emp_id int primary key,emp_name varchar(50),dept_id int, Salary int);
create table Projects(proj_id int primary key,proj_name varchar(50),emp_id int);
insert into Departments values (1,'HR'),
(2,'IT'),
(3,'Finance'),
(4,'Marketing');
insert into Employees values 
(101,'Alice',1,100000),
(102,'Bob',2,90000),
(103,'Charlie',3,80000),
(104,'David',4,70000),
(105,'Eve',null,45000);
insert into Employees values (106,'Fap',2,35000);

insert into Projects values 
(201,'Project1',101),
(202,'Project2',102),
(203,'Project3',101);

#Inner Join
select e.emp_name,d.dept_name 
from employees e
inner join departments d
on e.dept_id=d.dept_id;

select e.emp_name,d.dept_name 
from employees e
left join departments d
on e.dept_id=d.dept_id;

select e.emp_name,d.dept_name 
from employees e
right join departments d
on e.dept_id=d.dept_id;

#Full join

select e.emp_name,d.dept_name 
from employees e
left join departments d
on e.dept_id=d.dept_id
union
select e.emp_name,d.dept_name 
from employees e
right join departments d
on e.dept_id=d.dept_id;

select e.emp_name,d.dept_name 
from employees e
cross join departments d;

select a.emp_name as employees1, b.emp_name as employees2
from employees a 
join employees b
on a.dept_id = b.dept_id 
and a.emp_id != b.emp_id;