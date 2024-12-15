package Challenge99;

public class Main {
    public static void main(String[] args) {
        //1>creating two thread
        HelloThread t1 = new HelloThread(1);
        HelloThread t2 = new HelloThread(2);

        //2> Starting the thread
        t1.start();
        t2.start();


    }
}
