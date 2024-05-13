public class Queue {
    private Object[] elements;
    private int size;
    private int capacity;
    private int start;
    private int end;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
        this.start = 0;
        this.end = -1;
    }

    public Object add(Object element) {
        if (size == capacity)
            throw new IllegalStateException("The queue is full");
        end = (end+1) % capacity;
        elements[end] = element;
        size++;
        return element;
    }

    public Object pop() {
        if (size == 0)
            throw new IllegalStateException("The queue is empty");
        Object removed = elements[start];
        start++;
        size--;
        return  removed;
    }

    public Object first() {
        if (size == 0)
            throw new IllegalStateException("The queue is empty");
        return elements[start];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int queueSize() {
        return  size;
    }
}
