create table accounts (
  account_id int primary key,
  holder_name varchar(50),
  balance int
);

-- insert initial
insert into accounts values 
(1, 'alice', 5000),
(2, 'bob', 3000),
(3, 'charlie', 4000);

-- transaction 1
start transaction;
-- alice
update accounts set balance = balance - 1000 where account_id = 1; 
-- bob
update accounts set balance = balance + 1000 where account_id = 2;
rollback; 

-- transaction 2
start transaction;
-- alice
update accounts set balance = balance - 1000 where account_id = 1;
savepoint after_debit;
-- bob
update accounts set balance = balance + 1000 where account_id = 2; 
-- charlie
update accounts set balance = balance + 500 where account_id = 3; 
rollback to after_debit;
commit;

-- final balances
select * from accounts;

