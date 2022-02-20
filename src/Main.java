import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //employee
        String empName = scanner.next();
        int empAge = scanner.nextInt();
        String empPhnNum = scanner.next();
        String empOrganization = scanner.next();
        int empSalary = scanner.nextInt();
        String empRank = scanner.next();

        //student
        String stuName = scanner.next();
        int stuAge = scanner.nextInt();
        String stuPhnNum = scanner.next();
        double stuGpa = scanner.nextDouble();
        int stuId = scanner.nextInt();

        //person1
        String perName = scanner.next();
        int perAge = scanner.nextInt();
        String perPhnNum = scanner.next();
        //personInterface
        PersonInterface personInterface = new Person(empName, empAge, empPhnNum);
        personInterface.toString();

        Person1 person1 = new Person1(perName, perAge,perPhnNum);
        Student student = new Student(stuName, stuAge, stuPhnNum, stuGpa, stuId);
        Employee employee = new Employee(empName, empAge, empPhnNum, empOrganization, empSalary, empRank);

        System.out.println(employee.toString());
        System.out.println(student.toString());
        System.out.println(person1.toString());
    }

}
