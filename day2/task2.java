2 COUNT VOWELS AND CONSONANTS IN STRING
------------------------------------------------------------------
import java.util.Scanner;
public class VowelConsonantCounter {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);





    


        System.out.print("Enter a string: ");


        String input = scanner.nextLine();





         


        input = input.toLowerCase();





        int vowels = 0, consonants = 0;





        for (int i = 0; i < input.length(); i++) {


            char ch = input.charAt(i);





            if (Character.isLetter(ch)) {


                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {


                    vowels++;


                } else {


                    consonants++;


                }


            }


        }
