package search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine1 = p -> p.getName().contains(key);
        Predicate<Person> combine2 = p -> p.getSurname().contains(key);
        Predicate<Person> combine3 = p -> p.getPhone().contains(key);
        Predicate<Person> combine4 = p -> p.getAddress().contains(key);
        var result = new ArrayList<Person>();
        for (Person person : persons) {
            if (combine1.or(combine2).or(combine3).or(combine4).test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
