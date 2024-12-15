package PassBy;

public class TestPassByValue {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int sum = add(a,b);//primitives
        System.out.printf("a=%d,b=%d,sum=%d",a,b,sum);

    }
    //1>method for add()
    public static int add(int x, int y){ //java methods()
        //Here,add() try to save the variables
        x=909;
        return x;
    }
}
