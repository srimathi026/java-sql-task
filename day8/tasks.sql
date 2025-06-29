-- Connect to database
mysql> CREATE DATABASE school_lib;
Query OK, 1 row affected (0.01 sec)

mysql> USE school_lib;
Database changed


mysql> CREATE TABLE Student (
    -> student_id INT PRIMARY KEY,
    -> name VARCHAR(100),
    -> age INT,
    -> course_id INT
    -> );
Query OK, 0 rows affected (0.02 sec)

mysql> CREATE TABLE Course (
    -> course_id INT PRIMARY KEY,
    -> course_name VARCHAR(100),
    -> fees DECIMAL(10,2)
    -> );
Query OK, 0 rows affected (0.02 sec)


mysql> INSERT INTO Student VALUES (1, 'Ishu', 20, 101);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Student VALUES (2, 'Sana', 21, 102);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Student VALUES (3, 'Harithra', 22, 103);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Student VALUES (4, 'Reha', 23, 101);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Student VALUES (5, 'Ravi', 20, 102);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Course VALUES (101, 'Mathematics', 500.00);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Course VALUES (102, 'Physics', 600.00);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Course VALUES (103, 'Chemistry', 550.00);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Course VALUES (104, 'Biology', 650.00);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Course VALUES (105, 'English', 450.00);
Query OK, 1 row affected (0.01 sec)


mysql> UPDATE Course SET fees = fees + 50 WHERE course_name = 'Mathematics';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0


mysql> SELECT * FROM Course;
+-----------+-------------+--------+
| course_id | course_name | fees   |
+-----------+-------------+--------+
|       101 | Mathematics | 550.00 |
|       102 | Physics     | 600.00 |
|       103 | Chemistry   | 550.00 |
|       104 | Biology     | 650.00 |
|       105 | English     | 450.00 |
+-----------+-------------+--------+
5 rows in set (0.01 sec)


mysql> CREATE TABLE Books (
    -> book_id INT PRIMARY KEY,
    -> title VARCHAR(100),
    -> author VARCHAR(100)
    -> );
Query OK, 0 rows affected (0.02 sec)

mysql> CREATE TABLE Members (
    -> member_id INT PRIMARY KEY,
    -> name VARCHAR(100),
    -> join_date DATE
    -> );
Query OK, 0 rows affected (0.01 sec)

mysql> CREATE TABLE Transactions (
    -> trans_id INT PRIMARY KEY,
    -> book_id INT,
    -> member_id INT,
    -> borrow_date DATE
    -> );
Query OK, 0 rows affected (0.02 sec)
mysql> INSERT INTO Books VALUES (1, 'Java Programming', 'James Gosling');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Books VALUES (2, 'Database Systems', 'C.J. Date');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Books VALUES (3, 'Operating Systems', 'Andrew Tanenbaum');
Query OK, 1 row affected (0.01 sec)


mysql> INSERT INTO Members VALUES (1, 'Sara', '2024-05-10');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Members VALUES (2, 'Mike', '2024-06-12');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Members VALUES (3, 'Nina', '2024-06-20');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Transactions VALUES (1,1,2,'2024-06-15');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Transactions VALUES (2,2,1,'2024-06-18');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Transactions VALUES (3,3,3,'2024-06-20');
Query OK, 1 row affected (0.01 sec)

mysql> CREATE TABLE Department (
    -> dept_id INT PRIMARY KEY,
    -> dept_name VARCHAR(100)
    -> );
Query OK, 0 rows affected (0.02 sec)

mysql> CREATE TABLE Employee (
    -> emp_id INT PRIMARY KEY,
    -> emp_name VARCHAR(100),
    -> dept_id INT
    -> );
Query OK, 0 rows affected (0.02 sec)


mysql> INSERT INTO Department VALUES (1, 'HR');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Department VALUES (2, 'IT');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Department VALUES (3, 'Finance');
Query OK, 1 row affected (0.01 sec)


mysql> INSERT INTO Employee VALUES (1, 'Ishu', 2);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Employee VALUES (2, 'Sana', 1);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Employee VALUES (3, 'Harithra', 3);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Employee VALUES (4, 'Reha', 2);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Employee VALUES (5, 'Ravi', 1);
Query OK, 1 row affected (0.01 sec)

mysql> SELECT * FROM Employee;
+--------+-----------+---------+
| emp_id | emp_name  | dept_id |
+--------+-----------+---------+
|      1 | Ishu      |       2 |
|      2 | Sana      |       1 |
|      3 | Harithra  |       3 |
|      4 | Reha      |       2 |
|      5 | Ravi      |       1 |
+--------+-----------+---------+
5 rows in set (0.01 sec)

mysql> SELECT * FROM Department;
+---------+-----------+
| dept_id | dept_name |
+---------+-----------+
|       1 | HR        |
|       2 | IT        |
|       3 | Finance   |
+---------+-----------+
3 rows in set (0.01 sec)
