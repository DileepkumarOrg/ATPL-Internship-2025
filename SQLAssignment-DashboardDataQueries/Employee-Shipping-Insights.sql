-- how many orders has each employee handled?
select concat(e.firstname, ' ', e.lastname) as employeename, count(o.orderid) as ordershandled
from orders o
join employees e on o.employeeid = e.employeeid
group by employeename;

-- which employee generated the highest revenue?
select concat(e.firstname, ' ', e.lastname) as employeename,
       sum(od.quantity * p.price) as totalrevenue
from orders o
join employees e on o.employeeid = e.employeeid
join orderdetails od on o.orderid = od.orderid
join products p on od.productid = p.productid
group by employeename
order by totalrevenue desc
limit 1;

-- how frequently has each shipper been used?
select s.shippername, count(o.orderid) as shipmentcount
from orders o
join shippers s on o.shipperid = s.shipperid
group by s.shippername;

-- which shipper delivered the most revenue-generating orders?
select s.shippername, sum(od.quantity * p.price) as totalrevenue
from orders o
join shippers s on o.shipperid = s.shipperid
join orderdetails od on o.orderid = od.orderid
join products p on od.productid = p.productid
group by s.shippername
order by totalrevenue desc
limit 1;

