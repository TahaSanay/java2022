 --Select çalıştırmak istediğiniz kodu seçer
 --Select ContactName Adi, CompanyName SirketAdi, City Sehir from Customers
 Select ContactName, CompanyName, City from Customers

 Select * from Customers where City = 'London'

 --case insensitive - harf duyarsız

 select * from Products where CategoryID=1 or CategoryID=3

 select * from Products where CategoryID=1 and UnitPrice<=10

 select * from Products where CategoryID=1 order by UnitPrice desc --ascending --descending

 select count(*) from Products where CategoryID=2

 select categoryID, count(*) from products group by CategoryID having count(*)<10

 select categoryID, count(*) from products where UnitPrice>20 group by CategoryID having count(*)<10

 select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
 from Products inner join Categories
 on Products.CategoryID = Categories.CategoryID
 where Products.UnitPrice>10

 --DTO Data Transformation Object
 --inner join eşleşenleri getirir

 Select * from Products p inner join [Order Details] od
 on p.ProductID = od.ProductID
 inner join Orders o
 on o.OrderID = od.OrderID

 Select * from Customers c left join Orders o
 on c.CustomerID = o.CustomerID 
 where o.CustomerID is null
 --solda olup sağda olmayan

 Select * from Orders o right join Customers c 
 on c.CustomerID = o.CustomerID 
 where o.CustomerID is null
 --sağda olup solda olmayan