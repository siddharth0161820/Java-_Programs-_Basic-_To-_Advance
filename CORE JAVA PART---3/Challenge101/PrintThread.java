//Create three threads. Ensure that the second thread starts only after
//the first thread ends and the third thread starts only after the second
//thread ends using the join method. Each thread should print its start
//and end along with its name.

package Challenge101;

public class PrintThread extends  Thread {

    //1> Instance variable
    private  final int threadNumber;

    //2>Generate the constructor

    public PrintThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    //3> override a method i.e. run

    @Override
    public void run() {
            System.out.printf("%s Thread Starting  : %d\n" ,
                    Thread.currentThread().getName(),threadNumber);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.printf("%s Thread Ended  : %d\n" ,
                Thread.currentThread().getName(),threadNumber);


        }
    }

