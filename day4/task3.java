package Methods;
import java.io.FileWriter;
import java.io.IOException;
public class TASK3 {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("C://Users//rreha//OneDrive//Documents//demo.txt");
			myWriter.write("First line of the file");
			myWriter.write("\nSecond line of the file");
			myWriter.write("\nThird line of the file");
			myWriter.close();
			System.out.println("Successfullly writen to the file");
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();		}

	}

}
