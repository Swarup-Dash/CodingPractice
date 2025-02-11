import java.time.Year;

public class ExtractYear {
    public static void main(String[] args) {
        int date  = Year.now().getValue();
        System.out.println(date);
        String d = "Feb 11, 2025, at 15:45:30";
        String[] res = d.split(" ");
        System.out.println(res[2]);
        
    }
}
