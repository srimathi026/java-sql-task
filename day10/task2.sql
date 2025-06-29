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
