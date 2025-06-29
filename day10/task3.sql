MIN/MAX:

MariaDB [mysql]> create table products(
    -> prodid int,
    -> prodname varchar(10),
    -> prodcost int);
Query OK, 0 rows affected (0.054 sec)

MariaDB [mysql]> insert into products values(101,'facewash',500),(102,'lipstick',200),(103,'dryer',900);
Query OK, 3 rows affected (0.033 sec)
Records: 3  Duplicates: 0  Warnings: 0

MariaDB [mysql]> select * from products;
+--------+----------+----------+
| prodid | prodname | prodcost |
+--------+----------+----------+
|    101 | facewash |      500 |
|    102 | lipstick |      200 |
|    103 | dryer    |      900 |
+--------+----------+----------+
3 rows in set (0.000 sec)

MariaDB [mysql]> select max(prodcost) from products;
+---------------+
| max(prodcost) |
+---------------+
|           900 |
+---------------+
1 row in set (0.000 sec)

MariaDB [mysql]> select min(prodcost) from products;
+---------------+
| min(prodcost) |
+---------------+
|           200 |
+---------------+
1 row in set (0.037 sec)
