public class Person {
    String name;
    String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person name is " + name + " and age is " + age;
    }
}
