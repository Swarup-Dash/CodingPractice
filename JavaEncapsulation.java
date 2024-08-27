//Encapsulation
class A{
    private String name;
    private int roll;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setRoll(int roll){
        this.roll = roll;
    }
    
    public int getRoll(){
        return this.roll;
    }
}

public class JavaEncapsulation{
    public static void main(String[] args){
        A obj = new A();
        obj.setName("Swarup");
        obj.setRoll(15);
        
        System.out.println("My name is" + " " + obj.getName());
        System.out.println("My roll is" + " " + obj.getRoll());
    }
}
