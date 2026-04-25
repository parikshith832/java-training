create Database School_management_system;
use School_management_system;
create table students(
admission_id int primary key auto_increment,
student_name varchar(50),
branch_name varchar(15),
address varchar(50),
contact varchar(15),
admission_date timestamp default current_timestamp
);