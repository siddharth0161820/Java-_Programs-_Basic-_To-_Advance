package MultiThreading.ThreadClass;

import MultiThreading.FirstTask;
import MultiThreading.SecondTask;
import MultiThreading.ThirdTask;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        //to check time(in milisecond) taken to run the complete program
        // till it gives o/p is
        long  startTime = System.currentTimeMillis();

        ///TASK---demonstrate performing multiple small tasks at the same
        // time as per the sequence because the task performed under main thread(main thread executed by the JVM)...


        //Eventually,we are creating threads by declaring object of all 3 tasks
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        ////Staring of the Threads using start()/////
        System.out.println("\nStarting the 1st Thread");
        t1.start();
        System.out.println("\nStarting the 2nd Thread");
        t2.start();
        System.out.println("\nStarting the 3rd Thread");
        t3.start();


        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken to run the code :%d ",
                Thread.currentThread().getName(),
                (endTime-startTime));
    }
}
