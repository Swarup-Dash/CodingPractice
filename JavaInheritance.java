class Animal{
    public void animals(){
        System.out.println("Animals makes Sound");
    }    
}

class Dog extends Animal{
    public void animals(){
        System.out.println("Dogs Bark");
    }
}



public class JavaInheritance {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        // Animal obj2 = new Dog();
        obj1.animals();
        // obj2.animals();
    }
}
