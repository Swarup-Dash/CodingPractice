interface Animal{
    public void eat();
    public void sleep();
}

class Dog implements Animal{
    @Override
    public void eat(){
        System.out.println("I eat flesh");
    }

    @Override
    public void sleep(){
        System.out.println("I sleep in day");
    }
}

class Cat implements Animal{
    @Override
    public void eat(){
        System.out.println("I eat fish");
    }

    @Override
    public void sleep(){
        System.out.println("I sleep in Night");
    }
}

public class JavaInterface{
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();
    }
}
