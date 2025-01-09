import java.util.ArrayList;

class Student{
    String name;
    int mark;

    Student(String name, int mark){
        this.name=name;
        this.mark=mark;
    }
}

public class ProgramOnConstructure{
    public static void main(String[] args) {
        Student info = new Student("Swarup", 85);
        Student info1 = new Student("Aman", 95);
        Student info2 = new Student("Sohan", 55);
        Student info3 = new Student("Urbi", 98);

        ArrayList<Student> students = new ArrayList<>();
        students.add(info);
        students.add(info1);
        students.add(info2);
        students.add(info3);

        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).mark < students.get(j + 1).mark) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }

        System.out.println(students.get(1).mark);
        

    }
}