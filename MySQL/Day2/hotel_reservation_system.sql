create database hotel_reservation_system;
use hotel_reservation_system;
create table reservation(
reservation_id int auto_increment primary key,
guest_name varchar(50),room_number varchar(50),
contact_number varchar(15),
reservation_date timestamp default current_timestamp
);