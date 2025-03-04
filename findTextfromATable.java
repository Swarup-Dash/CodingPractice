public class findTextfromATable{
    public static void main(String[] args) {
        String[][] table = {
            {"Alice", "Bob", "Charlie", "David"},
            {"Eve", "Swarup1", "Swarup", "Grace"},
            {"Hank", "Ivy", "Jack", "Kevin"},
            {"Liam", "Mia", "Noah", "Olivia"}
        };
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
                if(table[i][j].equals("Swarup")){
                    System.out.println("Text found at "+i+" and "+j);
                }
            }
        }
    }
}