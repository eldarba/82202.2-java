create table book(
	id int primary key,
    author_id int,
    title varchar(50),
    publication_date date,
    price float,
    foreign key (author_id) references author(id)
);

create table author(
	id int primary key,
    `name` varchar(50),
    address varchar(50),
    age int
);