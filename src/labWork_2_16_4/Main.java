package labWork_2_16_4;

/**
 * Created by Bulik on 27.08.2016.
 */
public class Main {
    public static void foo(Animal animal){
        System.out.println("Animal");
    }
    public static void foo(Dog dog){
        System.out.println("Dog");
    }
    public static void foo(Puppy puppy){
        System.out.println("Puppy");
    }

    public static void main(String[] args) {
        foo(null);
        Dog dog = new Puppy();
        foo(dog);
        foo((Puppy)dog);
        foo((Animal)dog);
    }
}
