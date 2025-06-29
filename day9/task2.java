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
