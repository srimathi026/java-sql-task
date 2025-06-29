CREATE THREAD BY EXTENDING  THE THREAD CLASS  TO PRINT NUMBERS 1-10
-----------------------------------------------------------------------------------------------------------
 
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
            try {
               
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();  
    }
}
