import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueExample {

    public static void main(String[] args) {
        
        // Using Stack
        Stack<Integer> stack = new Stack<>();
        
        // Push elements onto the stack
        System.out.println("Using Stack:");
        stack.push(10); // Add 10 to the stack
        stack.push(20); // Add 20 to the stack
        stack.push(30); // Add 30 to the stack
        
        System.out.println("Stack after pushing elements: " + stack);
        
        // Pop elements from the stack (LIFO order)
        System.out.println("Popped from stack: " + stack.pop());
        System.out.println("Stack after popping one element: " + stack);
        
        // Peek the top element of the stack (view only, without removing)
        System.out.println("Peek the top element of the stack: " + stack.peek());
        
        // Check if stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("=====================================");
        
        // Using Queue
        Queue<Integer> queue = new LinkedList<>();
        
        // Enqueue elements into the queue
        System.out.println("Using Queue:");
        queue.offer(10); // Add 10 to the queue
        queue.offer(20); // Add 20 to the queue
        queue.offer(30); // Add 30 to the queue
        
        System.out.println("Queue after enqueueing elements: " + queue);
        
        // Dequeue elements from the queue (FIFO order)
        System.out.println("Dequeued from queue: " + queue.poll());
        System.out.println("Queue after dequeueing one element: " + queue);
        
        // Peek the front element of the queue (view only, without removing)
        System.out.println("Peek the front element of the queue: " + queue.peek());
        
        // Check if queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}

