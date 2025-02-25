public class ConvertIntToString{
    public static void main(String[] args) {
        int n = 5698;
        // String num = n+"";
        String num = Double.toString(n);
        // String num = String.valueOf(n);
        System.out.print(num);
    }
}