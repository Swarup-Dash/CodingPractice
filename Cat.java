interface Animal{
    public void eat();
    public void sleep();
}

public class Dog implements Animal{
    @Override
    public void eat(){
        System.out.println("I eat flesh");
    }

    public void sleep(){
        System.out.println("I sleep in day");
    }
}

public class Cat implements Animal{
    @ov
}
