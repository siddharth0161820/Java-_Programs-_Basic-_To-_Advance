package Polymorphism;

public class OverLoading {

    //8>Designing the constructor for overloading
     OverLoading(){ //ITS BLUE IN COLOR BCZ ITS GETTING USED AS OBJ CREATED FOR IT
         System.out.println("CALLING THE DEFAULT CONSTRUCTOR");
     }

     OverLoading(int a){
         System.out.println("parameterized constructor created");

     }
    //1> write a method for the sum of two numbers
    public int add(int a, int b){
        return a+b;
    }
    //4> if want to sum for 4 numbers then..
    public int add(int a,int b, int c,int d){ //name of the method can be same only if the argument list differs
        return a +b+c+d;
    }

    //5> sum for strings
    public String add(String a,String b, String c){
       // return a+b+c;
        return a.concat(b).concat(c);
    }






    //implemetation for the method() under psvm
    public static void main(String[] args) {
        //2>create the object for the class
        OverLoading overLoad = new OverLoading();
        System.out.println(overLoad.add(5,5));
        //3>if want to do the sum for 3 numbers then
        int add= overLoad.add(4,5);
        System.out.println(overLoad.add(add,10));

        //6>sum for strings
        System.out.println(overLoad.add("q","e","x"));

        //7>sum for 4 numbers
        System.out.println(overLoad.add(1,3,2,3));
    }

}
