package Challenge100;

public class TestThreadState {
    public static void main(String[] args) throws InterruptedException {

        //1>declaring/creating threadstate object
        ThreadState t1 = new ThreadState();
        //print the state of thread t1
        //to print the  state of the thread t1 , we do
        System.out.printf("\nThread created  %s ",
                t1.getState());

        //2>start the thread
        t1.start();

        t1.join(); //here all thraed will stop untill thread t1 not finished
        System.out.printf("\nThread finished  %s ",
                t1.getState());

    }
}
