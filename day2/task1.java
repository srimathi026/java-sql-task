Input an array of numbers and display the reverse:
--------------------------------------------------------import java.util.Scanner;

public class ReverseArray {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

 System.out.print("Enter the number of elements: ");


        int n = scanner.nextInt();


int[] arr = new int[n];

      System.out.println("Enter " + n + " numbers:");


        for (int i = 0; i < n; i++) {


            arr[i] = scanner.nextInt();


        }

System.out.print("Original array: ");


        for (int num : arr) {


            System.out.print(num + " ");


        }


System.out.print("\nReversed array: ");


        for (int i = n - 1; i >= 0; i--) {


            System.out.print(arr[i] + " ");


        }

scanner.close();


    }


}
