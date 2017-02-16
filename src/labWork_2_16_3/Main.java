package labWork_2_16_3;

/**
 * Created by Bulik on 27.08.2016.
 */
public class Main {
    public static void foo(int a, int b){
        System.out.println("(int, int) -> " + a +";"+ b);
    }
    public static void foo(int...arr){
        System.out.print("(int) : lenght = " +arr.length + " -> ");
        for (int elem : arr){
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        foo(5, -5);
        foo(1, 2, 3);
    }
}
