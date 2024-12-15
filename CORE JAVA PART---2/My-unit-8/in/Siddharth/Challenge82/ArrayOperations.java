package in.Siddharth.Challenge82;

public class ArrayOperations {
    //1> instance variables/attributes for ArrayOperations
    private int[] numbers;

    //4 create constructor  that takes number


    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    //2> create another static nested class
    public   class Statistics {
        //3>create two methods ;;
        //3.1> mean()
        public double mean() {
            double sum =0;
            for (int number : numbers) {
                sum += number;
            }
            return sum/ numbers.length;

        }

        //3.2> median()
        public double median(){
            return 0;

        }
    }
}
