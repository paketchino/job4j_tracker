package search;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key){
        ArrayList<Person> result = new ArrayList<Person>();
        for (Person person : result) {
            if (person.getName().contains(key) || person.getSurname().contains(key)
                    || person.getAddress().contains(key) || person.getPhone().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}
