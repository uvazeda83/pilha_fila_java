public class Stack {
    private Object[] elements;
    private int size;
    private int capacity;
    private int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
        this.top = -1;
    }

    public Object stack(Object element) {
        if (size == capacity)
            throw new IllegalStateException("The stack is full");
        top++;
        elements[top] = element;
        size++;
        return element;
    }

    public Object unstack() {
        if (size == 0)
            throw new IllegalStateException("The stack is empty");
        Object removed = elements[top];
        top--;
        size--;
        return removed;
    }

    public Object top() {
        if (size == 0)
            throw new IllegalStateException("The stack is empty");
        return elements[top];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
