package search;

import java.util.LinkedList;

/**
 *  Класс описывает работу простейшей очереди по приоритету, которая работает
 *  * по принципу FIFO (first in - first out)
 *  * @author Roman Kulyanin
 *  * @version 1.0
 */

public class PriorityQueue {
    /**
     * Хранение задания осуществляется в спике LinkedList
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод принимает на вход заявку и добавляет ее в очередь.
     * Если встречаются 2 задания с одинаковым приорететом, то в очереди
     * они распределяются по принпицу Firs in - First Out
     * @param task задача которая добавляется в очередь
     */

    public void put(Task task) {
        var index = 0;
        for (var element : tasks) {
            if (task.getPriority() <= element.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    /**
     *
     * @return возвращает задачу из головы или null если очереб пуста
     */

    public Task take() {
        return tasks.poll();
    }

}
