create database instagram_db;
use instagram_db;

#user table
create table users(
user_id int primary Key auto_increment,
username varchar(20) Unique,
email varchar(30) unique,
password varchar(12),
created_at  timestamp DEFAULT CURRENT_TIMESTAMP);

#post table

create table posts(
post_id int Primary Key Auto_Increment,
user_id int,
Foreign Key (user_id) references users(user_id),
image_url varchar(500),
caption varchar (500),
created_at timestamp DEFAULT CURRENT_TIMESTAMP
);

#likes table

create table likes(
like_id int Primary Key Auto_Increment,
user_id int,
Foreign Key(user_id) references users(user_id),
post_id int, 
Foreign Key (post_id) references posts(post_id)
);
#comments table

create table comments(
comment_id int Primary Key Auto_Increment,
user_id int,
Foreign Key(user_id) references users(user_id),
post_id int, 
Foreign Key (post_id) references posts(post_id),
comment varchar(50),
created_at  timestamp DEFAULT CURRENT_TIMESTAMP
);

create table followers(
follower_id int,
following_id int,
primary key (follower_id, following_id),    
foreign key (follower_id) references users(user_id),
foreign key (following_id) references users(user_id)
);
 insert into users (username, email, password) values
('Rahul', 'rahul@gmail.com', 'rahul123'),
('Sneha', 'sneha@gmail.com', 'sneha123'),
('Amit', 'amit@gmail.com', 'amit123'),
('Priya', 'priya@gmail.com', 'priya123'),
('Arjun', 'arjun@gmail.com', 'arjun123');

insert into posts (user_id, image_url, caption) values
(1, 'rahul1.jpg', 'Enjoying the sunset'),
(1, 'rahul2.jpg', 'Weekend vibes'),
(2, 'sneha1.jpg', 'Coffee time'),
(2, 'sneha2.jpg', 'At the beach'),
(3, 'amit1.jpg', 'Gym day'),
(4, 'priya1.jpg', 'Travel diaries'),
(4, 'priya2.jpg', 'Food love'),
(5, 'arjun1.jpg', 'Coding night');

insert into likes (user_id, post_id) values
(2,1),
(3,1),
(4,1),
(2,2),
(5,2),
(1,3),
(1,4),
(3,4),
(2,5),
(1,6),
(2,6),
(5,6),
(3,7),
(1,8),
(4,8);


insert into comments (user_id, post_id, comment) values
(2,1,'Nice post'),
(3,1,'Amazing'),
(1,2,'Great click'),
(5,2,'Loved it'),
(2,3,'Keep going'),
(1,4,'Beautiful place'),
(3,4,'Wow'),
(4,5,'Strong work'),
(2,6,'Yummy'),
(5,6,'Looks delicious'),
(1,7,'Nice shot'),
(3,8,'Coding mode'),
(4,8,'Cool setup');

insert into followers (follower_id, following_id) values
(1,2),
(1,3),
(2,1),
(2,3),
(2,4),
(3,1),
(4,1),
(5,1),
(5,2);

select * from users;
select * from posts;
select * from likes;
select * from comments;
select * from followers;

select u.username, post_id,image_url, caption,p.created_at
from  posts p  
join users u 
on u.user_id=p.user_id;

select p.post_id,count(l.like_id) 
as total_likes
from posts p
left join likes l 
on p.post_id=l.post_id
group by p.post_id;

select u.username,count(f.follower_id) as followers_count
from users u
join followers f on u.user_id=f.following_id
group by u.user_id
order by followers_count desc
limit 1;