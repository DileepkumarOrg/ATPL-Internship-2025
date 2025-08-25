-- What are the top 5 best-selling products by quantity?
Select o.Quantity, p.ProductName from OrderDetails o left join Products p on o.ProductID = p.ProductID 
order by o.Quantity desc 
LIMIT 5;

-- Which are the top 5 products by total revenue generated?
Select p.ProductID, p.ProductName, avg(o.Quantity*p.Price) from OrderDetails o left join Products p on o.ProductID = p.ProductID 
group by o.ProductID;

-- What is the average revenue per product?
Select p.ProductID, p.ProductName, avg(o.Quantity*p.Price) from OrderDetails o left join Products p on o.ProductID = p.ProductID 
group by ProductID;

-- What is the total revenue generated per product category?
select c.categoryname, sum(od.quantity * p.price) as totalrevenue from orderdetails od
join products p on od.productid = p.productid
join categories c on p.categoryid = c.categoryid
group by c.categoryname;

-- which product categories have the highest average price per product?
select c.categoryname, avg(p.price) as avgprice
from products p
join categories c on p.categoryid = c.categoryid
group by c.categoryname
order by avgprice desc;

