check for a leap year using the method:
--------------------------------------------
import java.util.Scanner;
public class LeapYearChecker {
public static boolean isLeapYear(int year) {


        if (year % 400 == 0) {


            return true;


        } else if (year % 100 == 0) {


            return false;


        } else if (year % 4 == 0) {


            return true;


        } else {


            return false;


        }


    }





    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a year: ");


        int year = scanner.nextInt();

       if (isLeapYear(year)) {


            System.out.println(year + " is a leap year.");


        } else {


            System.out.println(year + " is NOT a leap year.");


        }

  scanner.close();


    }


}
