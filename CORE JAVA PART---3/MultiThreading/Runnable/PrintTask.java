package MultiThreading.Runnable;

public class PrintTask implements  Runnable  {



    @Override
    public void run() {
        //PRINT TASK
        for (int i = 1; i <= 101 ; i++) {
            System.out.printf("%d%C ", i,targetChar);

        }
        System.out.printf("\n %s %c TASK 1st ACCOMPLISHED...",
                Thread.currentThread().getName(),targetChar);

    }

    private final char targetChar;

       ///consructor for targetcharACTER
       public PrintTask(char targetChar) {
           this.targetChar = targetChar;
       }


}
