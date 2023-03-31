package practiceJava.practiceAdvanced.practice08;

public class Runner {
    public static void main(String[] args) {

        B obj1 = new B();
        obj1.i=0;
        System.out.println(obj1.i);

        A obj2 = new A();
        System.out.println(obj2.i);
        obj2.yazdir();

        A obj = new B();
        System.out.println(obj.i);
        obj.yazdir();


    }
}
