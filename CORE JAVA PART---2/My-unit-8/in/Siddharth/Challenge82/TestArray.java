package in.Siddharth.Challenge82;

public class TestArray {
    public static void main(String[] args) {
        //1>create objects for arrayoperations
        ArrayOperations myArrayOperations = new ArrayOperations(new int[]{2,4});
        //2>creating objects for non static inner class
        //note ---inner class objects cannot be created directlY by outer object  .
        ArrayOperations.Statistics myStatistics =myArrayOperations.new Statistics();
        myStatistics.mean();
        System.out.println( myStatistics.mean());
    }
}
