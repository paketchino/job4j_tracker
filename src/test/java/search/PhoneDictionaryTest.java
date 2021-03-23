package search;

import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {
    @Test
    public void find() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("534872", "Bryansk", "Arsentev", "Petr")
        );
        phones.add(
                new Person("43345", "Penza", "Romonov", "Roman")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}