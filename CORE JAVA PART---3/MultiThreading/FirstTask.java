package MultiThreading;

public class FirstTask extends  Thread { //Here FirstTask extends Thread
    // but not got any responsibility of Thread bcz Thread is proper classes

    //2>Now if we want to write code under FirstTask extends Thread then
    // we need to override a method() i.e. run

    @Override
    public void run() {
        //Task 1>
        for (int i = 1; i <= 101 ; i++) {
            System.out.printf("%d* ", i);

        }
        System.out.printf("\n %s * TASK 1st ACCOMPLISHED...",
                Thread.currentThread().getName());

    }
}
