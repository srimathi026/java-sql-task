package method;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList<Object> arr=new ArrayList<Object>();
		arr.add("A");
		arr.add("Computer Science");
		arr.add("3 year");
		arr.add(0,"sana");
		arr.set(0,"reha");
		System.out.println(arr.get(1));
		//for (type iterator:existing variable)
		for(Object data:arr) {
			System.out.println(data);
		}
	}

}
