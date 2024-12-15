package Collectionsandgenerics;

public class VarArgs {
    public static void main(String... args) {//... means can get many arguments
        System.out.println(Sum(3,5));
        System.out.println(Sum(3,4,5));
        System.out.println(Sum(3,4,5,6));
        System.out.println(Sum(3,4,5,6,7));
        System.out.println(Sum(3,4,5,6,7,8));

    }
    //2>Using Variable arguments methods..varargs
    public static int Sum(int first, int second ,int...a){//must take atleast 2 arguments
        int Sum = first+second;
        for (int i :a) {
            Sum += i;
        }
        return  Sum;

    }
    //1> create a method()/function
    public static int Sum(int a, int b){
        return a+b;
    }
}
