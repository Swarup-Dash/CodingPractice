class A{
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(15.5, 4.5));
        System.out.println("Welcome To My Channel");
    }
}
