package MultiThreading;

public  class NeedOfMultiThreading {


    public static void main(String[] args) {
        //to check time(in milisecond) taken to run the complete program
        // till it gives o/p is
        long  startTime = System.currentTimeMillis();

        ///TASK---demonstrate performing multiple small tasks at the same
        // time as per the sequence because the task performed under main thread(main thread executed by the JVM)...

        
        //Task 1>
        for (int i = 1; i <= 101 ; i++) {
            System.out.printf("%d* ", i);

        }
        System.out.println("\nCONGRATS!, * TASK 1st ACCOMPLISHED...");

        //Task 2>
        for (int i = 1; i <= 101 ; i++) {
            System.out.printf("%d# ", i);

        }
        System.out.println("\nCONGRATS!, # TASK 2nd ACCOMPLISHED...");

        //Task 3>
        for (int i = 1; i <= 101 ; i++) {
            System.out.printf("%d$ ", i);

        }
        System.out.println("\nCONGRATS!, $ TASK 3rd ACCOMPLISHED...");
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken to run the code :%d ",(endTime-startTime));
    }
}
