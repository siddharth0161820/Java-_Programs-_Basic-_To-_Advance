package MultiThreading;
public class SecondTask extends Thread {//Here SecondTask extends Thread
    // but not got any responsibility of Thread bcz Thread is proper classes

    //2>Now if we want to write code under SecondTask extends Thread then
    // we need to override a method() i.e. run


    @Override
    public void run() {
        //Task 2>
        for (int i = 1; i <= 101 ; i++) {
            System.out.printf("%d# ", i);

        }

        System.out.printf("\n %s # TASK 2nd ACCOMPLISHED...",
                Thread.currentThread().getName());
    }

}
