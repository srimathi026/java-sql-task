package method;
import java.util.Map;
import java.util.HashMap;

public class day6task2 {

	public static void main(String[] args) {
		HashMap<String,Integer> mark=new HashMap();
		mark.put("Rehana",77);
		mark.put("Rehana1",88);
		mark.put("Rehana2",99);
		int totalMarks=0;
		for(int marks:mark.values()) {
			totalMarks+=marks;
		}
			System.out.println("Total Mark❤:"+totalMarks);
			double avg=totalMarks/mark.size();
			System.out.println("Average❤: "+avg);
		
		for(Map.Entry<String,Integer> entry : mark.entrySet()) {
			System.out.println(entry.getKey()+ " 😆"+entry.getValue());
		}
	}

}
