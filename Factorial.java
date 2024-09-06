public class Factorial {
    public static void main(String[] args) {
        int k = 10;
        Factorial fact = new Factorial();
        int res = fact.factorials(k);
        System.out.println(res);  
    }
    
    public int factorials(int k) {
        if (k > 0) {
            return k * factorials(k - 1);
        } else {
            return 1;  
        }
    }
}
