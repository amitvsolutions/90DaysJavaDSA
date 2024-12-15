import java.util.LinkedList;

public class LinkedListAsStackQueue{
    public static void main(String[] args)    {
        LinkedList<Integer> stack = new LinkedList<Integer>(); 
        //pushing the elements into the stack - LIFO
        stack.push(10); 
        stack.push(20); 
        stack.push(30);

        //Printing the elements of stack 
        System.out.println(stack);      	//Output : [30, 20, 10] 
        
        //Poping out the elements from the stack 
        System.out.println(stack.pop());    //Output : 30 
        System.out.println(stack.pop());    //Output : 20
        
        LinkedList<Integer> queue = new LinkedList<Integer>();        
        //adding the elements into the queue - FIFO
        queue.offer(10); 
        queue.offer(20); 
        queue.offer(30);
 
        //Printing the elements of queue 
        System.out.println(queue);      	//Output : [10, 20, 30]
 
        //Removing the elements from the queue 
        System.out.println(queue.poll());    //Output : 10 
        System.out.println(queue.poll());    //Output : 20
    }
}