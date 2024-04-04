package threads;

public class MultiThreadExample {
    public static void main(String[] args) {
        // Create threads
        Thread thread1 = new Thread(new NumberPrinter());
        Thread thread2 = new Thread(new LetterPrinter());

        // Start threads
        thread1.start();
        thread2.start();
    }
}

class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class LetterPrinter implements Runnable {
    @Override
    public void run() {
        for (char c = 'a'; c <= 'e'; c++) {
            System.out.println("Thread 2: " + c);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
