package ru.job4j.streram;
//
import java.util.Comparator;
import java.util.stream.*;
import java.util.List;

public class Profiles {
    /**
     * Метод принимает список, преобразует его, а затем
     * сортирует по String city удаляя дубликаты
     * @param profiles список`
     * @return возвращает profiles
     */
    List<Address> collect(List<Profile> profiles) {
        return profiles
                .stream()
                .map(Profile::getAddress)
                .sorted((o1, o2) -> o1.getCity().compareTo(o2.getCity()))
                .distinct()
                .collect(Collectors.toList());
    }
}
