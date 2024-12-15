package MultiThreading.TestingJoin;

import MultiThreading.Runnable.PrintTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        //to check time(in milisecond) taken to run the complete program
        // till it gives o/p is
        long  startTime = System.currentTimeMillis();

        //1>declaring/creating the object  for PrintTask
        PrintTask myPrintTask = new PrintTask('*');
        PrintTask myPrintTask1 = new PrintTask('$');
        PrintTask myPrintTask2 = new PrintTask('#');

        //2> CREATE A THREAD AND PASS PRINTTASK OBJECT AS AN ARGUMENT TO IT
        Thread t1 = new Thread(myPrintTask); //thread t1 is at new state,
        // thread created but not started...
        //3>start the thread
        t1.start();
        System.out.println("\nThread 1 started");
       // t1.join();
        Thread t2 = new Thread(myPrintTask1);
        //3>start the thread
        t2.start();
        System.out.println("\nThread 2 started");
        Thread t3 = new Thread(myPrintTask2);
        //3>start the thread
        t2.join();//start thread 3 after thread 2 completed...
        t3.start();
        System.out.println("\nThread 3 started");

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken to run the code :%d ",
                Thread.currentThread().getName(),
                (endTime-startTime));


    }
}