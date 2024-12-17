// 16. Write a program in Java to create a new thread and start it running.

// Approach 1: Extending the Thread Class :

class MyThread extends Thread {
    // Override the run() method to define the task of the thread
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class CreateThreadExample {
    public static void main(String[] args) {
        // Create a new thread object
        MyThread thread = new MyThread();
        
        // Start the thread
        thread.start();
        
        // Print message from the main thread
        System.out.println("Main thread is running...");
    }
}



// Approach 2: Implementing the Runnable Interface

// class MyRunnable implements Runnable {
//     // Implement the run() method to define the task of the thread
//     @Override
//     public void run() {
//         System.out.println("Thread is running using Runnable...");
//     }
// }

// public class CreateThreadExample {
//     public static void main(String[] args) {
//         // Create a Runnable object
//         MyRunnable myRunnable = new MyRunnable();
        
//         // Create a new thread by passing the Runnable object
//         Thread thread = new Thread(myRunnable);
        
//         // Start the thread
//         thread.start();
        
//         // Print message from the main thread
//         System.out.println("Main thread is running...");
//     }
// }
