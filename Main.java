import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // push element

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
       // pop element
        System.out.println("popped:"+stack.pop());

        // peek element

        System.out.println("Top element:" + stack.peek());

        System.out.println("Is your stack empty:-"+stack.isEmpty());

        
    }
}