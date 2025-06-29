Abstraction class
--------------------
package oops;

public abstract class AbstractClass {
	abstract int buySoap();
	int buyPerfume() {
		int amount=100;
		String name="chocolate Musk";
		int productcost= 80;
		int balance = amount-productcost;
		return balance;
		
		
		
	}
}
 

   Abstraction interface
---------------------------

package oops;

public interface AbstractInterface {
	void buydress();

}
class AbstractIn{
	void buychoco() {
		
	}
}


 encapsulation class
-----------------------------

package oops;
 import java.util.Date;
public class EncapsulationClass {
	private String email;
	private String username;
	private long mobile;
	private Date age;
	private char gender;
	private boolean graduate;
//setter	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public void setAge(Date age) {
		this.age = age;
	}
	public void setChar(char gender) {
		this.gender = gender;
	}
	public void setboolean(boolean graduate) {
		this.graduate = graduate;
	}

//getter
    public String getEmail() {
    	return email;
    }
    public String getUsername() {
    	return username;
    }
    public long getmobile() {
    	return mobile;
    }
    public Date age() {
    	return age;
    }
    public char gender() {
    	return gender;
    }
    public boolean graduate() {
    	return graduate;
    }
    }

OOPSClass
------------

package oops;
import java.util.Scanner;
public class OOPSClass {
	public static void main(String[] args) {
		EncapsulationClass user = new EncapsulationClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		user.setEmail(sc.next().toLowerCase());
		System.out.println("enter your email:");
		user.setEmail(sc.next().toLowerCase());
		System.out.println("enter your mobile:");
		user.setMobile(sc.nextLong()); 
		System.out.println("enter your gender:");
		user.setGender(sc.next().charAt(0);)
		 
}
	
}


  Inheritance
------------------

 package oops;

class Parent{
	 String haircolor="black";
	 void behaviour() {
		 System.out.println("attitude");
	 }
}
class Child extends Parent{
	 String haircolor="cyan";
	void behaviour() {
		 System.out.println("less attitude");
		 System.out.println("hair colour is "+haircolor);
	 }
}
public class InheritanceClass {
	public static void main(String[]args) {
Parent obj = new Child();
obj.behaviour();
}
}

Types of inheritance
------------------------

                                    single inheritance
                                    -------------------

package oops.stageofinherit;

 
class Parent{
	  
	 }

class Child extends Parent{
	  
}
public class SingleinheritanceClass {

}
            
                                    multilevel inheritance
                                   ------------------------

package oops.stageofinherit;
class MParent{
	
}
class MChild extends MParent{
	
}
class MGChild extends MParent{
	
}
class MGGChild extends MParent{
	
}
public class MultilevelinheritClass {

}
                                  
                                multiple inheritance
                                ---------------------

 package oops.stageofinherit;
 
interface MParent1{
	
}
interface MParent2{
	
}
interface MPChild extends MParent1,MParent2{
	
}

public class MultipleinheritClass {

}
                                   
                             heirarchical inheritance
                           ---------------------------

package oops.stageofinherit;
class HParent{
	
}
class HChild1 extends HParent{
	
}
class HChild2 extends HParent{
	
}
class HChild3 extends HParent{
	
}
public class HeirarchicalinheritClass {

}
