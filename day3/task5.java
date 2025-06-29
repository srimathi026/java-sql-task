                                                        class3
                                                       ---------





changing string to uppercase(using touppercase() method for changing into uppercase)


-------------------------------------------------------------------------------------


class Main {


    public static void main(String[] args) {


      String name="sasmitha";


      name.toUpperCase();


      System.out.println(name.toUpperCase());


    }


}








using stringbuffer to reverse the string (mutable)


--------------------------------------------------


class Main {


    public static void main(String[] args) {


      StringBuffer name=new StringBuffer();


      name.append("sasmitha");


      System.out.println(name.reverse());


    }


}





using string charAt()


---------------------





class Main {


    public static void main(String[] args) {


          String name ="sasmi";


         for(int i=0;i<=4;i++)


         {


             System.out.println(name.charAt(i));


         }


    }


}





class Main {


    public static void main(String[] args) {


          String name ="sasmi";


          int n=name.length();


         for(int i=0;i<n;i++)


         {


             System.out.println(name.charAt(i));


         }


    }


}





extracting vowels from the string


----------------------------------





class Main {


    public static void main(String[] args) {


          String name ="sasmi";


          int n=name.length();


          int count = 0;


         for(int i=0;i<n;i++)


         {


             System.out.println(name.charAt(i));


              if(name.charAt(i)=='a')


                   count++;


                    


              if(name.charAt(i)=='e')


                   count++;


                    


              if(name.charAt(i)=='i')


                   count++;


                    


              if(name.charAt(i)=='o')


                   count++; 


                    


              if(name.charAt(i)=='u')


                   count++;


         }


              System.out.println("vowel="+count);


         }


    }





 another method


-----------------


class Main {


    public static void main(String[] args) {


          String name ="sasmi";


          int n=name.length();


          int count = 0;


         for(int i=0;i<n;i++)


         {


             System.out.println(name.charAt(i));


              if(name.charAt(i)=='a'||name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')


                   count++;


                    


               


         }


              System.out.println("vowel="+count);


         }


    }





count for consonants and vowels


---------------------------------


  class Main {


    public static void main(String[] args) {


        String name="rehana";


        name=name.toLowerCase();


        int n = name.length();


        int count = 0;


        int conCount =0;


        for(int i=0;i<6;i++){


            System.out.println(name.charAt(i));


            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')


            count++;


            else if(name.charAt(i)>='a' && name.charAt(i)<='z'){


                conCount++;


            }


        }


        System.out.println("vowels="+(count));


          System.out.println("consonants="+(conCount));


    }





}
