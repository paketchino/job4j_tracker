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
     *
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
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
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
            items[index] = item;
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
        int start = index + 1;
        int distPos = index;
        int length = size - index;
        if (rsl) {
            System.arraycopy(items, start, items, distPos, length);
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }
    }
