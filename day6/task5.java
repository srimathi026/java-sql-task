public class VectorClass {
public static void main(String[]args) {
int[] arr = new int[5];
Vector<Integer> av = new Vector<Integer>();
av.add(10);
av.add(20);
av.add(30);
av.add(2,40);
av.add(3,50);
av.remove(0);
System.out.println(av.reversed());
System.out.println(av.contains(100));
System.out.println(av.size());
System.out.println(av);
}
}
Output
[30, 50, 40, 20]
false
4
[20, 40, 50, 30]




2.LinkedListclass
package Collections.list;
import java.util.LinkedList;
public class LinkedListClass {
public static void main(String[]args) {
LinkedList<Integer> llist = new
LinkedList<Integer>(); llist.add(10);
llist.add(20);
llist.add(30);
llist.add(null);
llist.add(null);
llist.add(2,40);
llist.set(3,50);
llist.remove(1);
System.out.println(llist.reversed());
System.out.println(llist.contains(100));
System.out.println(llist.size());
System.out.println(llist);
}
}
Output
[null, null, 50, 40, 10]
false
5
[10, 40, 50, null, null]



3.map

package Collections.Map;
import java.util.*;
import oops.EncapsulationClass;
public class HashMapClass {
public static void main(String[]args) {
Object[] arr = new Object[5];
Object[][] arr1 = new Object[5][6];
Object[] arr2 = new Object[5][6][4];
HashMap<String,Object> hm = new HashMap<>();
EncapsulationClass ec = new EncapsulationClass();
hm.put("name","Sri");
hm.put("Age",20);
hm.put("Details", ec);
hm.put(null, "Arav");
System.out.println(hm);
}
}
Output
{null=Arav,
Details=oops.EncapsulationClass@65ae6ba4, name=Sri,
Age=20}
