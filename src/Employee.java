public class Employee extends Person{
    String organization, rank;
    int salary;

    @Override
    public String toString() {
        return super.toString()+ " Org: "+ organization + " Salary: "+ salary + " Rank: "+ rank;
    }

    public Employee(String name, int age, String phnNum, String organization, int salary, String rank) {
        super(name, age, phnNum);
        this.organization = organization;
        this.salary = salary;
        this.rank = rank;
    }
}
