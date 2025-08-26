use Intern;

create table products_Dileep (
id int primary key,
name varchar(50)
);
insert into products_Dileep values (3,"Product3"),(4,"Product4");
select * from products_Dileep;

select * from products_Dileep  where name like '%duct%';
