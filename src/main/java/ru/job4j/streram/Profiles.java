package ru.job4j.streram;

import java.util.Comparator;
import java.util.stream.*;
import java.util.List;

public class Profiles {
    List<Address> collect(List<Profile> profiles) {
        return profiles
                .stream()
                .map(Profile::getAddress)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
