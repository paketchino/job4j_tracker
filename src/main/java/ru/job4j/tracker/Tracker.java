package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;


    public Item add(Item item) {
        /**
         * добавляет заявку в массив items
         * через setId проставляется ключ
         * ids используется для регенерации нового ключа
         */
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /**
     * size - поле массива
     *
     * @return
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    /**
     * Создать результирующий массив где будут храниться ячейки
     * newSize = счетчик который будет перемещаться по результирующему массиву
     * @param key
     * @return
     */
    public Item[] findByName(String key) {
        Item[] rsl = items;
        int newSize = 0;
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                rsl[newSize] = items[i];
                newSize++;
            }
        }
        return Arrays.copyOf(rsl, newSize);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
    }
