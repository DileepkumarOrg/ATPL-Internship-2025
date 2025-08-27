use Intern;

create table products_Dileep (
id int primary key,
name varchar(50)
);
insert into products_Dileep values (3,"Product3"),(4,"Product4");
select * from products_Dileep;

select * from products_Dileep  where name like '%duct%';

alter table products_Dileep add Price int;

update products_Dileep set Price = 650 where id =5;


insert into products_Dileep values(6,"Product6",null);

Delete from products_Dileep where id = 6;