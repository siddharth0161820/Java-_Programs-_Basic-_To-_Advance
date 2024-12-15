//  Write a program that creates two threads. Each thread should print
//"Hello from Thread X", where X is the number of the thread (1 or 2),
//ten times, then terminate...

package Challenge99;

public class HelloThread extends  Thread {

    //1> Instance variable
    private  final int threadNumber;

    //2>Generate the constructor

    public HelloThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    //3> override a method i.e. run

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d)  %s Hello from thread : %d\n" ,(i+1),
                    Thread.currentThread().getName(),threadNumber);
        }
    }
}
