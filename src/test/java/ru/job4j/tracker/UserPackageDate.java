package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserPackageDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date " + currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time " + currentTime);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDataTimeFormat = currentDateTime.format(formatter);
        System.out.println("Current data time of formatter " + currentDataTimeFormat);
    }
}
