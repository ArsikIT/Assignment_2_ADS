# Custom Data Structures in Java

## ✅ Project Overview

This project implements custom versions of several core data structures in Java **without using any part of `java.util.*`**, except for `Iterator` and `Scanner`. The purpose is to understand and practice building physical and logical data structures from scratch.

---

## 📦 Implemented Structures

### 🔹 Interface: `MyList<T>`
A generic interface that defines standard list operations:
- `add(T item)`
- `get(int index)`
- `remove(int index)`
- `clear()`
- `size()`
- `set(int index, T item)`

---

### 🔹 Physical Data Structures

#### 1. `MyArrayList<T>`
A dynamic array implementation:
- Backed by `Object[]`
- Auto-resizes when full
- Used by `MyStack` and `MyMinHeap`

#### 2. `MyLinkedList<T>`
A doubly linked list:
- Uses internal `MyNode` class (with `prev`, `next`, and `data`)
- Maintains `head`, `tail`, and `size`
- Used by `MyQueue`

---

### 🔹 Logical Data Structures

#### 1. `MyStack<T>`
Implements a LIFO stack:
- Uses `MyArrayList`
- Supports `push`, `pop`, `peek`, `isEmpty`, `size`

#### 2. `MyQueue<T>`
Implements a FIFO queue:
- Uses `MyLinkedList`
- Supports `enqueue`, `dequeue`, `peek`, `isEmpty`, `size`

#### 3. `MyMinHeap<T extends Comparable<T>>`
Implements a binary min-heap:
- Uses `MyArrayList`
- Supports `insert`, `extractMin`, `peek`, `heapifyUp`, `heapifyDown`

---

## 💻 How to Run

### Requirements
- Java 8 or above
- IntelliJ IDEA or any Java IDE
- Or compile via terminal

### Run the program
1. Compile all `.java` files
2. Run `Main.java`
3. Follow the console menu to interact with the data structures

```bash
javac *.java
java Main
