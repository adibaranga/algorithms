package stack;

/**
 * Created with IntelliJ IDEA.
 * User: Adi1
 * Date: 1/26/14
 * Time: 2:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class StackApp {

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        while (!stack.isEmpty()) {
            int value = stack.peek();
            System.out.println("Value: " + value);
            value = stack.pop();
            System.out.println("Value: " + value);
        }
    }
}
