package labWork_2_16_5;

/**
 * Created by Bulik on 27.08.2016.
 */
public class Main {
    public static void foo(int i){
        System.out.println("int");
    }
    public static void foo(byte b){
        System.out.println("bute");
    }
    public static void foo(int... ar){
        System.out.println("ar");
    }

    public static void main(String[] args) {
        byte b = 5;
        foo(b);
        foo(5);
        foo(b, (short)100);
        foo(5, 5);
    }

}
