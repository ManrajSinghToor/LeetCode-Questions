# Write your MySQL query statement below
select name as Customers 
from Customers
WHERE id NOT IN
(select customerId 
from Customers as c 
inner join orders as o 
on c.id = o.customerId
);