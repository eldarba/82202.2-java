-- an SQL command for creating a table
create table `persons`(`id` int, `name` varchar(10), `age` int);

-- insert data to table
-- 101, Dan, 25
insert into `persons` values(101, 'Dan', 25);
insert into `persons` values(102, 'Sarrah', 33);
insert into `persons` values(103, 'Ben', 27);

-- fetch all persons
select * from `persons`;
select `name`, `age` from `persons`;
-- fetch 1 person
select * from `persons` where `id` = 102;
select * from `persons` where `name` = 'Dan';

-- update a record (line) Ben age = 28
update persons set `age` = 28 where `id` = 103;


