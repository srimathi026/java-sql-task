PRINT MESSAGE FROM MULTIPLE THREADS
----------------------------------------------------------------
 
public class MessagePrinter implements Runnable {

    private String message;

    
    public MessagePrinter(String message) {
        this.message = message;
    }

    @Override
    public void run() {
       
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message + " (" + i + ")");
            try {
                Thread.sleep(300);  
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + Thread.currentThread().getName());
            }
        }
    }
 public static void main(String[] args) {
        Runnable task1 = new MessagePrinter("Hello from Thread 1");
        Runnable task2 = new MessagePrinter("Hello from Thread 2");
        Runnable task3 = new MessagePrinter("Hello from Thread 3");

        Thread thread1 = new Thread(task1, "Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");
        Thread thread3 = new Thread(task3, "Thread-3");

        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
