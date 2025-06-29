DEMONSTRATE  SLEEP() AND JOIN () USING THREAD COORDINATION
------------------------------------------------------------------------------------------------

 
public class ThreadCoordination {

    
    static class NumberPrinter extends Thread {
        private String name;

        public NumberPrinter(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " - Number: " + i);
                try {
                    Thread.sleep(500);  
                } catch (InterruptedException e) {
                    System.out.println(name + " interrupted.");
                }
            }
        }
    }

    public static void main(String[] args) {
        NumberPrinter thread1 = new NumberPrinter("Thread-1");
        NumberPrinter thread2 = new NumberPrinter("Thread-2");

        thread1.start();

        try {
            thread1.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting.");
        }

        thread2.start();
