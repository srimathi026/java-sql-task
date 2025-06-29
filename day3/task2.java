PERSON- Employee class with salary calculation:
--------------------------------------------------------


package methods;





class Person {


    String name;





    Person(String name) {


        this.name = name;


    }


}





class Employee extends Person {


    double salary;





    Employee(String name) {


        super(name);


    }





    void showSalary() {


        System.out.println(name + "'s Salary: $" + salary);


    }


}





class FullTimeEmployee extends Employee {


    FullTimeEmployee(String name, double fixedSalary) {


        super(name);


        this.salary = fixedSalary;


    }


}





class PartTimeEmployee extends Employee {


    PartTimeEmployee(String name, int hours, double rate) {


        super(name);


        this.salary = hours * rate;


    }


}





class Freelancer extends Employee {


    Freelancer(String name, int hours, double rate, double bonus) {


        super(name);


        this.salary = (hours * rate) + bonus;


    }


}





public class day3task2 {


    public static void main(String[] args) {


        FullTimeEmployee e1 = new FullTimeEmployee("rehana", 5000);


        PartTimeEmployee e2 = new PartTimeEmployee("sana", 80, 20);


        Freelancer e3 = new Freelancer("joshini", 60, 25, 300);





        e1.showSalary();


        e2.showSalary();


        e3.showSalary();


    }


}
