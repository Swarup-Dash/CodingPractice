class car{
    String model;
    int year;

    // Constructor
    car(String model, int year){
        this.model = model;
        this.year = year;
    }
    void display(){
        System.out.println("Car model is"+ " " + model +" "+ "of year"+ " " + year);
    }
}

public class Constructor {
    public static void main(String[] args) {
        car mycar = new car("BMW", 2024);
        mycar.display();
    }
}
