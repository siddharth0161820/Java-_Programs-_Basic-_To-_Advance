package Challenge110;

public class TestingFunctionalInterface {
    public static void main(String[] args) {
        // Implement it using a lambda that checks if the number is prime

        //1> lambda implementation and check number is prime or not..
        Truth truth = num -> {
            //using for loop and check number is prime or nottt...
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
                };

        //2> call/invoke to check prime number
        System.out.println(truth.isCandidate(5));
        System.out.println(truth.isCandidate(8));

    }
}


