abstract class Animal{
    abstract void makeSound();

    void sleep(){
        System.out.println("Animal Can sleep");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog Sound....");
    }

}

public class AbstractJava{
    public static void main(String[] args) {
        Animal obj = new Dog(); // We can also write Dog obj = new Dog();

        obj.makeSound();
        obj.sleep();
    }
}