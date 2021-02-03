package search;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class PriorityQueueTest {

    @Test
    public void whenHigherPriority() {
         PriorityQueue priorityQueue = new PriorityQueue ();
         priorityQueue.put(new Task("low", 5));
         priorityQueue.put(new Task("middle", 3));
         priorityQueue.put(new Task("urgent", 1));
         Task result = priorityQueue.take();
         assertThat(result.getDesc(), is("urgent"));
    }

}