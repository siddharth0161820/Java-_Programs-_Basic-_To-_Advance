package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {

        //1> creating/declaring the list with an element to it.
        List<Integer> numbers = List.of(1,3,5,6,7,8,8);
        //List<Integer> numbers = List.of();

        //2>applying reduce
        Optional<Integer> sumNum = numbers.stream()
                .reduce((a,b)->a+b); //we can directly run reduce without any
               // default value but in that case  it dont return int ;;it returns Optional<Integer>.
        //here, if the list above do have no values then reduce dont work ;;need atleast
        //one value to return;; empty list available then reduce return th empty stream


        //3> Now check do reduce gives any values in return or not..
        //optional will give values  in this case so check....
        //so, apply if -else statement...
//        if(sumNum.isPresent()){
//            System.out.println(sumNum.get());
//        }else{
//            System.out.println("List is empty....");
//        }
        //if else for empty list using optional.empty()
        if(sumNum.isEmpty()){
            System.out.println("List is empty buddy as optional returns nothing");
        }else{
            System.out.println("Elements presence traced in the list");
        }
    }
}
