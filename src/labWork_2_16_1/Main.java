package labWork_2_16_1;

/**
 * Created by Bulik on 27.08.2016.
 */
public class Main {
    public static void main(String[] args) {
       Animal animal = new Dog();
        foo(animal);
        foo(new Dog());//
    }
    public static void foo(Animal animal){
        System.out.println("Animal");
    }
    public static void foo(Dog dog){
        System.out.println("Dog");
    }
}
