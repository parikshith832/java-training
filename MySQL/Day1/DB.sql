create database db;
use db;
create table EMP(
emp_id int primary key, name varchar(20), department varchar(20), salary int);
insert into EMP values (1, 'Ravi', 'IT', 50000),
(2, 'Anu', 'HR', 40000),
(3, 'Kiran', 'Finance', 60000),
(4, 'Sneha', 'Marketing', 45000),
(5, 'Arjun', 'IT', 55000);

#stored procedure
DELIMITER $$
create procedure getallemp()
BEGIN
	select * from EMP;
END $$
DELIMITER ;
call getallemp();


DELIMITER $$
create procedure getbydep(in dept_name varchar(50))
BEGIN	
    select * from EMP
	where department=dept_name;
END $$
DELIMITER ;
call getbydep('IT');

DELIMITER $$
create procedure getbysal(out total int)
BEGIN	
    select sum(salary) into total from EMP;
END $$
DELIMITER ;
call getbysal(@total);
select @total;