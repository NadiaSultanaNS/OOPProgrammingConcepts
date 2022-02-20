public class Person1 {
    private String name;
    private int age;
    private String phnNum;
    public Person1(String name, int age, String phnNum){
        this.name = name;
        this.age = age;
        this.phnNum = phnNum;
    }

    @Override
    public String toString() {
        return "Name: "+ name + " Age: " + age + " Phone Number: "+ phnNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhnNum() {
        return phnNum;
    }

    public void setPhnNum(String phnNum) {
        this.phnNum = phnNum;
    }
}
