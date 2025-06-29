Print all even numbers between 1 and 100:
-------------------------------------------------
import java.util.Scanner;
class Main {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
 int a=s.nextInt();
  System.out.println("Enter the range:");
   int b=s.nextInt();
  for (int i=a;i<b;i++){
if(i%2==0){
System.out.println(i);
 }  
public class EvenNumbers {
public static void main(String[] args) {
for (int i = 2; i <= 100; i += 2) {
System.out.println(i);
}
}
}
