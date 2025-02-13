import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = primeCheck(num);
        if(res){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
    static boolean primeCheck(int num){
        if(num<1){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
