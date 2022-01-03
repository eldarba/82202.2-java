create table books(
	id int primary key auto_increment,
    title varchar(50),
    author varchar(50),
    publication_date date,
    price float
);



select * from books;

-- CRUD
-- create, read, update, delete

-- CREAT
insert into books values(0, 'sql 1', 'Dan', '2000-07-25', 30.75);
insert into books values(0, 'sql 2', 'Dan', '2005-07-01', 55.75);
insert into books values(0, 'sql 3', 'Lea', '2012-01-25', 100);

-- read all
select * from books;

-- READ find the book with id 2
select * from books where id = 2;

-- UPDATE - change the price of 'sql 3' to 125
update books set price = 125 where id = 3;

-- DELETE - delete 'sql 1'
-- delete from books where id = 1;