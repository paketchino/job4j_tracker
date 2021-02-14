package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Arrays;
import java.util.List;

public final class Tracker {
    private static Tracker instance = null;

    private final List<Item> items = new ArrayList<>(100);
    private int ids = 1;
    private int size = 0;

    private Tracker() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;    
    }

    public Item add(Item item) {
        /**
         * добавляет заявку в массив items
         * через setId проставляется ключ
         * ids используется для регенерации нового ключа
         */
        int index = 0;
        item.setId(ids++);
        items.set(size++, items.get(index));
        return item;
    }

    /**
     * size - поле массива
     *
     * @return
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Создать результирующий массив где будут храниться ячейки
     * newSize = счетчик который будет перемещаться по результирующему массиву
     *
     * @param key
     * @return
     */
    public List<Item> findByName(String key) {
        List<Item> rsl = items;
       for (Item item : items) {
            if (key.equals(item.getName())) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * @param id   - уникальный идентификатор заявки
     * @param item - заявку которую нужно заменить
     * @return возвращает заявку
     */

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != 1;
        if (rsl) {
            items.set(id, item);
        }
        return rsl;
    }

    /**
     *
     *int start - индекс следующего элемента
     * @param id
     * @return
     */
    public boolean deleted(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }
    }
