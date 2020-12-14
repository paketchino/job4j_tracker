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

    public Item[] findByName(String key) {
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                // Не понимаю что тут писать
            }
        }
        return Arrays.copyOf(items, size);
    }

}