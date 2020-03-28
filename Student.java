import java.util.ArrayList;
import java.util.OptionalDouble;

public class Student {
    String index;
    String firstName;
    String lastName;
    ArrayList<Integer> grades;
    //TODO constructor

    public Student(String index, String firstName, String lastName,ArrayList<Integer> grades) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getAverage() {
        return grades.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }

    public int ECTSCredits() {
        return (int) (grades.stream().filter(x -> x>5).count() * 6);
    }
}
