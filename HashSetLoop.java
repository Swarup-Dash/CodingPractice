import java.util.HashSet;

public class HashSetLoop {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<String>();

        //to add items to it, use the add() method
        myHashSet.add("Swarup");
        myHashSet.add("Aman");
        myHashSet.add("Swarup");
        myHashSet.add("Pooja");
        myHashSet.add("Kumar");

        //Loop Through HashSet
        for (String i : myHashSet) {
            System.out.println(i);
            
        }
    }
}
