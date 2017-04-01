package sdaacademy.pl.simplelistviewexample;

import java.util.ArrayList;
import java.util.List;


public class PersonProvider {


    public List<Person> provide() {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Arek", "Plumbaum", 33));
        personList.add(new Person("Ola", "Nowak", 23));
        personList.add(new Person("Ala", "Kowalska", 28));
//
//        Person person1 = new Person("Arek", "Plumbaum", 33);
//        Person person2 = new Person("Ola", "Nowak", 23);
//        Person person3 = new Person("Ala", "Kowalska", 28);
//        personList.add(person1);
//        personList.add(person2);
//        personList.add(person3);

        return personList;
    }
}
