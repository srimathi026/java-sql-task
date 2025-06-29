 CLASS 5
EXCEPTION HANDLING
--------------------
try catch
----------
package exceptionhandling;

 
import java.util.Arrays;

public class TryCatchClass {
	public static void main(String[] args) {
		int[] arr=new int[5];
		 System.out.println(Arrays.toString(arr ));
		try {
			arr[10]=12;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		 
		System.out.println(Arrays.toString(arr));
	}
}

divide by zero
---------------   
package exceptionhandling;

 
import java.util.Arrays;

public class TryCatchClass {
	public static void main(String[] args) {
		 int[] arr=new int[5];
		 System.out.println(Arrays.toString(arr ));
		try {
			int div =10/0;
			arr[10]=12;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(ArithmeticException e) {
			System.out.println("Infinite");
		}
		 
		System.out.println(Arrays.toString(arr));
	}
}
   
COLLECTIONS
-------------

package collections;

import java.util.ArrayList;

public class ArrayListClass {
 public static void main(String[] args) {
	 int[] arr= new int[5];
	 arr[0]=10;
	 ArrayList<Integer> alist= new ArrayList<>(100);
	 alist.add(10);
	 alist.add(20);
	 alist.add(30);
	 alist.add(2,40);
	 alist.set(3,50);
	 alist.remove(1);
	 System.out.println(alist.reversed());
	 System.out.println(alist.contains(100));
	 System.out.println(alist.size());
	 System.out.println(alist);
	 }
}
