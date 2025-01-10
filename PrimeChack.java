public class PrimeChack {
    public static void main(String[] args) {
        int num = 30;
        boolean res = checkPrime(num);
        if(res){
            System.out.println("Prime");
        }else{
            System.out.println("not Prime");
        }
    }
    static boolean checkPrime(int num){
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
