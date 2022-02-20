public class Student extends Person{
    double gpa;
    int id;

    @Override
    public String toString() {
        return super.toString()+ " GPA: "+ gpa + " ID: " + id;
    }

    public Student(String name, int age, String phnNum, double gpa, int id) {
        super(name, age, phnNum); //calling the person constructor;
        this.gpa = gpa;
        this.id = id;
    }
}
