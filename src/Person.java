public class Person implements PersonInterface{

    String name;
    int age;
    String phnNum;
    public Person(String name, int age, String phnNum){
        this.name = name;
        this.age = age;
        this.phnNum = phnNum;
    }
    public void hello(){

    }

    @Override
    public String toString() {
        return "Name: "+ name + " Age: " + age + " Phone Number: "+ phnNum;
    }

    @Override
    public double calculate(int num) {
        return Math.sqrt(num);
    }

    @Override
    public String sayName(String name) {
        return "Hello, My name is "+name;
    }
}
