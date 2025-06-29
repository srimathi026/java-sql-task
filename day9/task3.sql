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
