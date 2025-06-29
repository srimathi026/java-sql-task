COUNT STUDENT PER COURSE:

MariaDB [mysql]> create table details(
    -> name varchar(10),
    -> id int,
    -> dep varchar(50));
Query OK, 0 rows affected (0.058 sec)

MariaDB [mysql]> insert into details values('nisha',01,'it'),('abi',02,'bca'),('madhu',03,'bca');
Query OK, 3 rows affected (0.033 sec)
Records: 3  Duplicates: 0  Warnings: 0

MariaDB [mysql]> select * from details;
+-------+------+------+
| name  | id   | dep  |
+-------+------+------+
| nisha |    1 | it   |
| abi   |    2 | bca  |
| madhu |    3 | bca  |
+-------+------+------+
3 rows in set (0.000 sec)

MariaDB [mysql]> select dep, count(*) as  studentcount from details group by dep;
+------+--------------+
| dep  | studentcount |
+------+--------------+
| bca  |            2 |
| it   |            1 |
+------+--------------+
2 rows in set (0.000 sec)
