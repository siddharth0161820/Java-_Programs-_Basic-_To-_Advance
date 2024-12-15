package Challenge100;

public class ThreadState extends Thread {

    //1> override a method i.e. run


    @Override
    public void run() {
        try {
            Thread.sleep(8000); //1 second =1000 millisecond
            //to print the current state of the thread, we do
            System.out.printf("\nFrom inside run %s ",
                    Thread.currentThread().getState());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
