import java.util.*;

class Main {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            String str = null;
            System.out.println(str.length());
        }
        catch (ArithmeticException ae) {
            System.out.println(
                "Caught ArithmeticException: " + ae);
        }
        catch (NullPointerException ae) {
            System.out.println(
                "Caught NullPointerException: " + ae);
        }
    }
}
