package labWork_2_16_2;

/**
 * Created by Bulik on 27.08.2016.
 */
public class Main {
    public static void foo(int i) {
        System.out.println("int");

    }
    public static void foo(Byte b){
        System.out.println("Byte");
    }

    public static void main(String[] args) {
        byte b = 10;
        foo(b);
        foo(100);
        foo((byte)1L);
    }
}
