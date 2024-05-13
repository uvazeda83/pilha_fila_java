public class Main {
    public static void main(String[] args) {
        // Testing the queue
        Queue queue = new Queue(5);

        System.out.println("Adding: " + queue.add("Bee"));
        System.out.println("Adding: " + queue.add("Bernardo"));
        System.out.println("Adding: " + queue.add("House"));
        System.out.println("Adding: " + queue.add("Dagron"));
        System.out.println("Adding: " + queue.add("Enzo"));

        System.out.println("The queue is empty? " + queue.isEmpty());

        System.out.println("First element of the queue: " + queue.first());
        System.out.println("Size of the queue: " + queue.queueSize());

        while (!queue.isEmpty())
            System.out.println("Removing " + queue.pop() + " from the queue");

        System.out.println("The queue is empty? " + queue.isEmpty());

        // Testing the stack
        Stack stack = new Stack(5);

        System.out.println("\nAdding: " + stack.add("Fabio"));
        System.out.println("Adding: " + stack.add("Geraldo"));
        System.out.println("Adding: " + stack.add("Helicopter"));
        System.out.println("Adding: " + stack.add("Page"));

        System.out.println("The stack is empty? " + stack.isEmpty());

        System.out.println("First element of the stack: " + stack.top());
        System.out.println("Size of the stack: " + stack.stackSize());

        while (!stack.isEmpty())
            System.out.println("Removing " + stack.pop() + " from the stack");

        System.out.println("The stack is empty? " + stack.isEmpty());
    }
}