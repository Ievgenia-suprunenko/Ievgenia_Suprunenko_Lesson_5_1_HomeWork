package test1;

public class Programmer extends Employee {
    String programmingLanguage;

    public Programmer(String name, int age, double salary) {
        super(name, age, salary);
    }

    public Programmer(String name, int age, double salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void printDatas() {
        super.printData();
        System.out.println("Language: " + programmingLanguage);
    }
}
