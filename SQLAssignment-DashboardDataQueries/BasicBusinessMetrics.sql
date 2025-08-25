-- What is the total number of orders?
SELECT count(*) as "Total Orders" FROM Orders;

-- How many customers are there?
SELECT count(*) FROM Customers;

-- What is the total revenue from all orders?
Select sum(o.Quantity*p.price) as "Total Revenue" from OrderDetails o left join Products p on o.ProductID = p.ProductID;

