MariaDB [mysql]> create table books(
    -> title varchar(50),
    -> author varchar(50),
    -> availablebooks varchar(60));
Query OK, 0 rows affected (0.026 sec)

MariaDB [mysql]> insert into books values('HarryPotter','J.K.Rowling','come and visit shop'),('Beloved','Toni Morrison','come and visit shop'),('EightLives','Rajmohan Gandhi','come and visit shop');
Query OK, 3 rows affected (0.003 sec)
Records: 3  Duplicates: 0  Warnings: 0

MariaDB [mysql]> select * from books;
+-------------+-----------------+---------------------+
| title       | author          | availablebooks      |
+-------------+-----------------+---------------------+
| HarryPotter | J.K.Rowling     | come and visit shop |
| Beloved     | Toni Morrison   | come and visit shop |
| EightLives  | Rajmohan Gandhi | come and visit shop |
+-------------+-----------------+---------------------+
3 rows in set (0.000 sec

MariaDB [mysql]> select * from books where title like'%a%';
+-------------+-------------+---------------------+
| title       | author      | availablebooks      |
+-------------+-------------+---------------------+
| HarryPotter | J.K.Rowling | come and visit shop |
+-------------+-------------+---------------------+
1 row in set (0.000 sec)

---------------------------------------------------------------
