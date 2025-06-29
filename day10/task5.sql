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

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
TASK-2
AVERAGE SALARY CALCULATION:

MariaDB [mysql]> select * from employee;
+-------+---------+---------+--------+
| empid | empname | dept    | salary |
+-------+---------+---------+--------+
|     1 | shivani | IT      |  20000 |
|     2 | thilo   | HR      |  50000 |
|     3 | abi     | testing |  40000 |
+-------+---------+---------+--------+
3 rows in set (0.000 sec)

MariaDB [mysql]> select dept, avg(salary) as salary from employee group by dept;
+---------+------------+
| dept    | salary     |
+---------+------------+
| HR      | 50000.0000 |
| IT      | 20000.0000 |
| testing | 40000.0000 |
+---------+------------+
3 rows in set (0.000 sec)

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
TASK-3
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

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
MAIN PROGRAM:
REPORT:

MariaDB [task]> create table report(
    -> deptno int,
    -> deptname varchar(10),
    -> name varchar(10),
    -> salary int);
Query OK, 0 rows affected (0.010 sec)

MariaDB [task]> insert into report values(1,'HR','Rani',50000),(2,'HR','amu',30000),(3,'Testing','geetha',80000),(4,'development','mani',75000);
Query OK, 4 rows affected, 1 warning (0.003 sec)
Records: 4 Duplicates: 0 Warnings: 1

MariaDB [task]> select * from report;
+--------+------------+---------+--------+
| deptno | deptname | name | salary |
+--------+------------+---------+--------+
| 1 | HR | Rani | 50000 |
| 2 | HR | amu | 30000 |
| 3 | Testing | geetha | 80000 |
| 4 | development | mani | 75000 |
+--------+------------+---------+--------+
4 rows in set (0.000 sec)

MariaDB [task]> select deptname,count(*)as totalemployees,sum(salary) as totalsalary,avg(salary) as averagesalary,min(salary)as minimumsalary,max(salary)as maximumsalary from report group by deptname;
+------------+----------------+-------------+---------------+---------------+---------------+
| deptname | totalemployees | totalsalary | averagesalary | minimumsalary | maximumsalary |
+------------+----------------+-------------+---------------+---------------+---------------+
| developmen | 1 | 75000 | 75000.0000 | 75000 | 75000 |
| HR | 2 | 80000 | 40000.0000 | 30000 | 50000 |
| Testing | 1 | 80000 | 80000.0000 | 80000 | 80000 |
+------------+----------------+-------------+---------------+---------------+---------------+
3 rows in set (0.001 sec)
