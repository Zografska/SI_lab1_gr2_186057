import java.util.ArrayList;

public class Faculty {

    ArrayList<Student> students;
    String name;

    public Faculty(String name) {
        this.name = name;
        this.students= new ArrayList<>();
    }
    public double averageGPA(){
        return students.stream().mapToDouble(Student::getAverage).average().getAsDouble();
    }
    public Student getStudent(int index){
        return students.get(index);
    }
    public void addStudent(Student student)
    {
        students.add(student);
    }
}
