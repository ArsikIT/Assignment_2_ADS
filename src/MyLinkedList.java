public class MyLinkedList<T> implements MyList<T> {
    private MyNode head;
    private MyNode tail;
    private int length;

    public MyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    @Override
    public void add(T item) {
        MyNode newNode = new MyNode(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            head = head.next;
            if (head != null) head.prev = null;
        } else {
            MyNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current.prev != null) current.prev.next = current.next;
            if (current.next != null) current.next.prev = current.prev;
            if (current == tail) tail = current.prev;
        }
        length--;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        length = 0;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public void set(int index, T value) {

    }

    private void checkIndex(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds.");
        }
    }

    private class MyNode {
        T data;
        MyNode next;
        MyNode prev;

        public MyNode(T data) {
            this.data = data;
        }
    }
}
