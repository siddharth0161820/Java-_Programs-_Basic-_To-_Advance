//.Create your own functional interface with a single abstract
//method that accepts an integer and returns a boolean.
//Implement it using a lambda that checks if the number is
//prime.

package Challenge110;
//2>
@FunctionalInterface // to define functional interface with itself we need @Functional Interface

public interface Truth {
    //1>
    boolean isCandidate(int num); //method that accepts an
    // integer and returns a boolean

    //3>


}
