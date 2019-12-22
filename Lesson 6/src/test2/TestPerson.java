package test2;

import com.sun.tools.attach.AgentInitializationException;
import test1.Person;

public class TestPerson {
    public static void main(String[] args) {

        Person person = new Person();

        person.name = "AAA";
        person.age = 12;

        person.printName();
        person.printAge();
    }
}
