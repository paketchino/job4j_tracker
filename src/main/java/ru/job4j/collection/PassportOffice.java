package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {

    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (citizens.containsKey(citizen.getPassport())) {
            for (String key : citizens.keySet()) {
                Citizen value = citizens.get(key);
                citizens.put(citizen.getPassport(), value);
            }
            rsl = true;
    }
            return rsl;

    }

    public Citizen get(String passport) {
        return null;
    }
}
