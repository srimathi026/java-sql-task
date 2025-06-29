package demo1;
import java.io.*;

public class main {
    public static void main(String[] args) {
       

        try {
            BufferedReader br = new BufferedReader(new FileReader("C://Users//rreha//OneDrive//Documents//reha1.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users//rreha//OneDrive//Documents//reha2.txt"));

            String line = br.readLine(); 
            if (line != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                int total = 0;

                for (int i = 1; i < parts.length; i++) {
                    total += Integer.parseInt(parts[i]);
                }

                double average = (double) total / (parts.length - 1);

                bw.write("Name: " + name);
                bw.newLine();
                bw.write("Total: " + total);
                bw.newLine();
                bw.write("Average: " +average); 
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Code executed successfully ");
        } catch (IOException e) {
            System.out.println("Error occured");
        }
    }
}
