package search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class PhoneDictionaryTest {

    @Test
    public void find() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(
                new Person("123456","penza","Roman", "Romanov")
        );
        ArrayList<Person> persons = phoneDictionary.find("Roman");
        assertThat(persons.get(0).getSurname(), is("Romanov"));
    }
}