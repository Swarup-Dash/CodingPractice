import java.util.LinkedList;
import java.util.Queue;

public class QueueRetrival {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

        for(int i=10; i<15; i++){
            queue.add(i);
        }
        System.out.println(queue);
        queue.poll();

        System.out.println("After retriving" + queue);


    }
}
