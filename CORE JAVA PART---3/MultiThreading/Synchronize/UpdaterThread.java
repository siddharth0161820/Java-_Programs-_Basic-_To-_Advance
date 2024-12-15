package MultiThreading.Synchronize;

public class UpdaterThread  extends  Thread {


    //1> instance variable
    private final Counter counter; //wkt,class is also a datatype but not primitive dataTYPE

       //2>constructor
       public UpdaterThread(Counter counter) {
           this.counter = counter;
       }

    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            counter.increment();
            
        }
    }
}
