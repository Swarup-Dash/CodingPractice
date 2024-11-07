import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series"+" "+ a +" ,"+ b + " ,"); 

        for(int i=2; i<val; i++){
            int fibo = a+b;
            System.out.print(fibo + " ,");
            a=b;
            b=fibo;
        }
        sc.close();
    }
}
