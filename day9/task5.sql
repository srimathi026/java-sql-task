MariaDB [mysql]> create table marks(
    -> regno int,
    -> name varchar(20),
    -> marks int);
Query OK, 0 rows affected (0.071 sec)

MariaDB [mysql]> insert into marks values(1,'nisha',90),(2,'abi',70),(3,'madhu',95);
Query OK, 3 rows affected (0.043 sec)
Records: 3  Duplicates: 0  Warnings: 0

MariaDB [mysql]> select * from marks;
+-------+-------+-------+
| regno | name  | marks |
+-------+-------+-------+
|     1 | nisha |    90 |
|     2 | abi   |    70 |
|     3 | madhu |    95 |
+-------+-------+-------+
3 rows in set (0.000 sec)

MariaDB [mysql]> select marks from marks where marks<80;
+-------+
| marks |
+-------+
|    70 |
+-------+
1 row in set (0.020 sec)

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
MAIN PROGRAM:
FILTERING:

MariaDB [mysql]> create table member(
    -> name varchar(10),
    -> place varchar(10),
    -> age int);
Query OK, 0 rows affected (0.046 sec)

MariaDB [mysql]> insert into member values('nisha','ooty',30),('abi','goa',20),('madhu','mumbai',25);
Query OK, 3 rows affected (0.038 sec)
Records: 3  Duplicates: 0  Warnings: 0

MariaDB [mysql]> select * from member;
+-------+--------+------+
| name  | place  | age  |
+-------+--------+------+
| nisha | ooty   |   30 |
| abi   | goa    |   20 |
| madhu | mumbai |   25 |
+-------+--------+------+
3 rows in set (0.000 sec)

MariaDB [mysql]> select * from member where place='goa';
+------+-------+------+
| name | place | age  |
+------+-------+------+
| abi  | goa   |   20 |
+------+-------+------+
1 row in set (0.000 sec)

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
TASK-2:
ASCENDING ORDER:

MariaDB [mysql]> create table coursess(
    -> coursename varchar(10),
    -> courseid int,
    -> mentorname varchar(10),
    -> coursefee int);
Query OK, 0 rows affected (0.030 sec)

MariaDB [mysql]> insert into coursess values('java',1,'jeeva',20000),('sql',2,'jeni',25000),('html',3,'sami',15000);
Query OK, 3 rows affected (0.006 sec)
Records: 3  Duplicates: 0  Warnings: 0

MariaDB [mysql]> select * from coursess;
+------------+----------+------------+-----------+
| coursename | courseid | mentorname | coursefee |
+------------+----------+------------+-----------+
| java       |        1 | jeeva      |     20000 |
| sql        |        2 | jeni       |     25000 |
| html       |        3 | sami       |     15000 |
+------------+----------+------------+-----------+
3 rows in set (0.000 sec)

MariaDB [mysql]> select * from coursess order by coursefee;
+------------+----------+------------+-----------+
| coursename | courseid | mentorname | coursefee |
+------------+----------+------------+-----------+
| html       |        3 | sami       |     15000 |
| java       |        1 | jeeva      |     20000 |
| sql        |        2 | jeni       |     25000 |
+------------+----------+------------+-----------+
3 rows in set (0.001 sec)

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
TASK-3:
KEYWORDS LIKE:
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
