//A HashSet is a collection of items where every item is unique, and it is found in the java.util package.

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        
        HashSet<String> myHashSet = new HashSet<String>();

        //to add items to it, use the add() method
        myHashSet.add("Swarup");
        myHashSet.add("Aman");
        myHashSet.add("Swarup");
        myHashSet.add("Pooja");
        myHashSet.add("Kumar");

        System.out.println(myHashSet);
        //In the example above, even though Swarup is added twice it only appears once in the set because every item in a set has to be unique.

        //To check whether an item exists in a HashSet, use the contains() method.
        System.out.println(myHashSet.contains("Aman")); //Output: true
        System.out.println(myHashSet.contains("Amlan"));//Output: false

        //To remove an item, use the remove() method.
        myHashSet.remove("Kumar");
        System.out.println(myHashSet);

        //To find out how many items there are, use the size() method
        System.out.println(myHashSet.size());

        //To remove all items, use the clear() method
        myHashSet.clear();
        System.out.println(myHashSet);
    }

}