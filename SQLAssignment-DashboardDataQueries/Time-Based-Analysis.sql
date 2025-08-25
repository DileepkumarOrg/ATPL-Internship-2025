-- how many orders are placed each month?
select date_format(orderdate, '%y-%m') as month, count(*) as ordercount
from orders
group by month;


-- what is the average order value per month?

select date_format(orderdate, '%y-%m') as month, avg(ordertotal) as avgordervalue
from (
  select od.orderid, date_format(od.orderdate, '%y-%m') as month, sum(o.quantity * p.price) as ordertotal
  from orders od
  join orderdetails o on od.orderid = o.orderid
  join products p on o.productid = p.productid
  group by od.orderid
) as monthlyorders
group by month;


-- which month had the highest number of orders?
select date_format(orderdate, '%y-%m') as month, count(*) as ordercount
from orders
group by month
order by ordercount desc
limit 1;