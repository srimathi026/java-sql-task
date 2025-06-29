sum of array:
--------------
class Main {


    public static void main(String[] args) {


         int arr[]={1,2,3,4,5};


         int sum=0;


         for(int i=0;i<arr.length;i++)


         {


             sum=sum+arr[i];


         }


             


         System.out.println("sum of array:"+ sum);


         


    }


}








getting array size and value from user:


---------------------------------------





import java.util.Scanner;


class Main {


    public static void main(String[] args) {


          Scanner in = new Scanner(System.in);


         System.out.println("enter the size of array:");


         int n= in.nextInt();


         int[] arr = new int[n];


         for(int i=0;i<n;i++)


         {


             System.out.println("enter the value");


             arr[i] = in.nextInt();


         }


         System.out.println("array entered");


         


    }


}








import java.util.Scanner;


class Main {


    public static void main(String[] args) {


          Scanner in = new Scanner(System.in);


         System.out.println("enter the size of array:");


         int n= in.nextInt();


         int[] arr = new int[n];


         for(int i=0;i<n;i++)


         {


             System.out.println("enter the value");


              arr[i] = in.nextInt();


               System.out.println("the value is:"+ arr[i]);


         


         }


         


         


    }








2dimensional array


--------------------





import java.util.Scanner;


class Main {


    public static void main(String[] args) {


          int row=5,col=5;


          int arr[][]= new int[row][col];


          for(int i=0;i<row;i++)


          {


              for(int j=0;j<col;j++)


              {


                  arr[i][j]=10;


                  System.out.print(arr[i][j]+" ");


              }


              System.out.println();


          }


           


        }


}








import java.util.Scanner;


class Main {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.println("enter the size of row:");


            int row= in.nextInt();


            System.out.println("enter the size of column:");


            int col= in.nextInt();


         int arr[][]= new int[row][col];


            


          for(int i=0;i<row;i++)


          {


              for(int j=0;j<col;j++)


              {


                  arr[i][j]=10;


                  System.out.print(arr[i][j]+" ");


              }


              System.out.println();


          }


           


        }


}











string .equals


--------------





class Main {


    public static void main(String[] args) {


        String str ="hello";


        String str1 = new String("hello");


         String str2 = new String("hello");


         System.out.println(str.equals(str2));


    }


}
