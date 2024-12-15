package Challenge102;

public class TestRoad {
    public static void main(String[] args) throws InterruptedException {
        //1>declaring/creating the object for the trafficLightThread
        TrafficLightThread red = new TrafficLightThread(TrafficColor.RED);
        TrafficLightThread yellow = new TrafficLightThread(TrafficColor.YELLOW);
        TrafficLightThread green = new TrafficLightThread(TrafficColor.GREEN);

        //2> STARTING THE THREADS

        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
        //red.join();


    }
}