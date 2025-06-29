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
