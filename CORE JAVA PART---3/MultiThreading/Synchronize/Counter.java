package MultiThreading.Synchronize;

public class Counter {
    //1> Instance variable/attributes
    private int count = 0;


    //2> Method()/function
    public synchronized  void increment(){
        count++;
    }public int getCount(){
        return count;
    }


}
