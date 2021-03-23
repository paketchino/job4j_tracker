package ru.job4j.function;
//
import java.util.ArrayList;
import java.util.List;

public class SearchFolder {
    /**
     * Метод производит поиск по размеру в массиве List проверяя наличие
     * его в переопределенном интерфейсе predicate если folder.getSize > 100
     * @param list принимаемый массив
     * @return возвращает метод filter
     */
    public static List<Folder> filterSize(List<Folder> list) {
      Predicate<Folder> predicate = new Predicate<Folder>() {
          @Override
          public boolean test(Folder folder) {
              return folder.getSize() > 100;
          }
      };
      return filter(list, predicate);
    }
    /**
     * Метод производит поиск имен в массиве List проверяя наличие
     * его в переопределенном интерфейсе predicate
     * @param list принимаемый массив
     * @return возвращает метод filter
     */

    public static List<Folder> filterName(List<Folder> list) {
        Predicate<Folder> predicate = new Predicate<Folder>() {
            @Override
            public boolean test(Folder folder) {
                return folder.getName().contains("bug");
            }
        };
        return filter(list, predicate);
    }

    /**
     * Метод принимает список и проверяет наличие в нем обьекта
     * @param list принимаемый массив
     * @param predicate анонимный класс
     * @return возвращает созданый список
     */
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> predicate) {
        List<Folder> rsl = new ArrayList<>();
        for (Folder s : list) {
            if (predicate.test(s)) {
                rsl.add(s);
            }
        }
        return rsl;
    }
}
