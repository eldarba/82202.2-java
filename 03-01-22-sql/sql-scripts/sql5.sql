insert into author values(201, 'Daniela', 'Israel', 33);
insert into author values(205, 'Yosi', 'France', 25);

select * from author;
select * from book;
select * from author;
delete from author; -- empty the table

-- add a book named Java-1 by author Daniela
insert into book values(1, 201, 'Java-1', '2020-02-23', 122);
insert into book values(2, 205, 'HTML-1', '2015-02-23', 30);

-- add a book named HTML-1 by author Yosi

select 
b.`id` 'book id', 
b.`title` 'book title', 
b.`price` 'book price', 
a.`name` 'author name' 
from book b join author a
on b.author_id=a.id;




select b.id as 'book id', a.name as 'author name' 
from book as b join author as a 
on b.author_id=a.id;




