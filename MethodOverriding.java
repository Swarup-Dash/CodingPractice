// Without inheritance we can not acheive method overloading.
class A {
    public void name() {
        System.out.println("My name is Swarup");
    }
}

class B extends A {
    @Override
    public void name() {
        System.out.println("My name is Arnab");
    }
}

class C extends A {
    @Override
    public void name() {
        System.out.println("My name is Mukesh");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        A objA = new A();
        A objB = new B();
        A objC = new C();

        objA.name();  // Calls A's name method
        objB.name();  // Calls B's overridden name method
        objC.name();  // Calls C's overridden name method
    }
}
