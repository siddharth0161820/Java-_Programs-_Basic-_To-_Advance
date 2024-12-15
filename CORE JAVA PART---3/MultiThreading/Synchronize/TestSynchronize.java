package MultiThreading.Synchronize;

public class TestSynchronize {
    public static void main(String[] args)  {
        long startTime = System.currentTimeMillis();

        //1> create the object for the counter class
        Counter myCounter = new Counter();
        UpdaterThread t1 = new UpdaterThread(myCounter);
        UpdaterThread t2 = new UpdaterThread(myCounter);

          //2>Start the thread
        t1.start();
        t2.start();

        try {
            //2>start the thread
           // t1.start();
            t1.join(); //main thread stop execution and wait till t1 thread complete its task
           // t2.start();
           t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted: "+e.getMessage()+e.getCause());
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("Final counter value: %d and time taken :%d",
                myCounter.getCount(),
                (endTime-startTime));

    }
}
