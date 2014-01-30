package queue;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/26/14
 * Time: 3:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class QueueApp {

    public static void main (String[] args) {
        Queue queue = new Queue(10);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.insert(60);
        queue.insert(70);
        queue.insert(80);
        queue.insert(90);
        queue.insert(100);

        while (!queue.isEmpty()) {
            queue.peek();
            System.out.println(queue.remove());
        }
    }
}
