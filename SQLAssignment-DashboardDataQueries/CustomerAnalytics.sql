-- who are the top 5 customers by purchase volume?
select cu.customername, sum(od.quantity * p.price) as totalspent from orders o
join customers cu on o.customerid = cu.customerid
join orderdetails od on o.orderid = od.orderid
join products p on od.productid = p.productid
group by cu.customername
order by totalspent desc
limit 5;

-- how many customers are there in each country?
select country, count(*) as numcustomers
from customers
group by country
order by numcustomers desc;

-- which country contributes the most to total revenue?
select cu.country, sum(od.quantity * p.price) as revenue from orders o
join customers cu on o.customerid = cu.customerid
join orderdetails od on o.orderid = od.orderid
join products p on od.productid = p.productid
group by cu.country
order by revenue desc
limit 1;

-- what is the average order value per customer?
select cu.customername, avg(ordervalue) as avgordervalue
from (select o.orderid, o.customerid, sum(od.quantity * p.price) as ordervaluefrom orders o
join orderdetails od on o.orderid = od.orderid
join products p on od.productid = p.productid
group by o.orderid, o.customerid
) as ordervalues
join customers cu on ordervalues.customerid = cu.customerid
group by cu.customername;

-- which customers placed more than 5 orders?
select cu.customername, count(*) as ordercount from orders o
join customers cu on o.customerid = cu.customerid
group by cu.customername
having count(*) > 5
order by ordercount desc;

