package search;

import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {
    @Test
    public void find() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("534872", "Bryansk", "Arsentev", "Petr")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}