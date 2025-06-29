class Main {
    public static void main(String[] args) {
         String gender="male";
         int age = 16;
         if(age<18 || gender=="female")
         {
             System.out.println("ticket is free");
         }
         else{
             System.out.println("ticket is not free");
         }
    }
}


switch case

class Main {
    public static void main(String[] args) {
         String gender="female";
         int age = 26;
         if(age<18 || gender=="female")
         {
             System.out.println("ticket is free");
         }
         else{
        
              int km =20;
              switch(km) {
                 case 5:{
                     System.out.println("50");
                     break;
                 }
                  case 10:{
                     System.out.println("100");
                     break;
                 }
                  default:{
                     System.out.println("not applicable");
                     break;
                 }
              }
         }
    }
}


for loop
class Main {
    public static void main(String[] args) {
 for(int i=0;i<5;)
 {
    i+=2; //i=i+2
     System.out.println(i);
 }
    }
}
---------------------------------------------------------------
method 

class Main {
    int mymethod(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
       
        Main mi = new Main();
        System.out.println(mi.mymethod(10,7));
       
    }
}
