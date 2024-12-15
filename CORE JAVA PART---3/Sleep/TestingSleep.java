package Sleep;

public class TestingSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before sleeping..");
        //invoking /calling methods which is actually a static method() can be called from anywhere

         //1> sleep()

        Thread.sleep(10000); //10000 millisec =10 sec
        System.out.println("Woke up..");



    }
}

