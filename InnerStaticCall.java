class A{
    static class B {
        static void display(){
            System.out.println("Hello World");
        }
    }
}

public class InnerStaticCall{
    public static void main(String[] args) {
        // A obj = new A();
        A.B.display();
    }
}