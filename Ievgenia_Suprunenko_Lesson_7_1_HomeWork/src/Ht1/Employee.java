package Ht1;

public class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void printData (){
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
