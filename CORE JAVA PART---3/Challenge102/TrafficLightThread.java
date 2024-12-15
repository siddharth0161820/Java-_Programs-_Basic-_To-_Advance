// Simulate a traffic signal using threads. Create three threads
//representing three signals: RED, YELLOW, and GREEN. Each signal
//should be on for a certain time, then switch to the next signal in order.
//Use sleep for timing and synchronize to make sure only one signal is
//active at a time...

package Challenge102;

public class TrafficLightThread extends Thread {

    //1> INSTANCE VARIABLE
    private final TrafficColor color;

   //2>constructor for trafficColor
    public TrafficLightThread(TrafficColor color) {
       this.color = color;
    }

    //3> create overwrite run method()

    @Override
    public void run() {
        System.out.printf("%s  active\n",color);
        //make a particular color visible for certain time make thread sleep
        try {
            Thread.sleep(color.getOnTimeInMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s  Inactive\n",color);
    }
}
