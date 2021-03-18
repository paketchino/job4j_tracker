package ru.job4j.streram;

import java.util.stream.*;
import java.util.List;

public class Profiles {
    List<Address> collect(List<Profile> profiles) {
        return profiles
                .stream().map(Profile::getAddress)
                .collect(Collectors.toList());
    }
}
