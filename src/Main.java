import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyStack<Integer> stack = new MyStack<>();
        MyQueue<String> queue = new MyQueue<>();
        MyMinHeap<Integer> heap = new MyMinHeap<>();

        while (true) {
            System.out.println("\n=== Select Data Structure ===");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. MinHeap");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //newline

            switch (choice) {
                case 1 -> {
                    System.out.println("\n--- Stack Operations ---");
                    System.out.println("1. Push");
                    System.out.println("2. Pop");
                    System.out.println("3. Peek");
                    System.out.println("4. Size");
                    System.out.print("Enter operation: ");
                    int sc = scanner.nextInt();
                    switch (sc) {
                        case 1 -> {
                            System.out.print("Enter number to push: ");
                            stack.push(scanner.nextInt());
                        }
                        case 2 -> System.out.println("Popped: " + stack.pop());
                        case 3 -> System.out.println("Top: " + stack.peek());
                        case 4 -> System.out.println("Size: " + stack.size());
                        default -> System.out.println("Invalid option.");
                    }
                }

                case 2 -> {
                    System.out.println("\n--- Queue Operations ---");
                    System.out.println("1. Enqueue");
                    System.out.println("2. Dequeue");
                    System.out.println("3. Peek");
                    System.out.println("4. Size");
                    System.out.print("Enter operation: ");
                    int qc = scanner.nextInt();
                    scanner.nextLine(); // flush newline
                    switch (qc) {
                        case 1 -> {
                            System.out.print("Enter string to enqueue: ");
                            queue.enqueue(scanner.nextLine());
                        }
                        case 2 -> System.out.println("Dequeued: " + queue.dequeue());
                        case 3 -> System.out.println("Front: " + queue.peek());
                        case 4 -> System.out.println("Size: " + queue.size());
                        default -> System.out.println("Invalid option.");
                    }
                }

                case 3 -> {
                    System.out.println("\n--- MinHeap Operations ---");
                    System.out.println("1. Insert");
                    System.out.println("2. Extract Min");
                    System.out.println("3. Peek Min");
                    System.out.println("4. Size");
                    System.out.print("Enter operation: ");
                    int hc = scanner.nextInt();
                    switch (hc) {
                        case 1 -> {
                            System.out.print("Enter number to insert: ");
                            heap.insert(scanner.nextInt());
                        }
                        case 2 -> System.out.println("Extracted Min: " + heap.extractMin());
                        case 3 -> System.out.println("Peek Min: " + heap.peek());
                        case 4 -> System.out.println("Size: " + heap.size());
                        default -> System.out.println("Invalid option.");
                    }
                }

                case 0 -> {
                    System.out.println("Exiting program...");
                    return;
                }

                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
