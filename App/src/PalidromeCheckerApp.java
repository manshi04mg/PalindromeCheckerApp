import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalidromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create Stack and Queue
        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<Character>();

        // Insert characters into both structures
        for(int i = 0; i < word.length(); i++)
        {
            stack.push(word.charAt(i));     // LIFO
            queue.add(word.charAt(i));      // FIFO
        }

        boolean isPalindrome = true;

        // Compare pop and dequeue
        while(!stack.isEmpty())
        {
            if(stack.pop() != queue.remove())
            {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if(isPalindrome)
        {
            System.out.println(word + " is a Palindrome");
        }
        else
        {
            System.out.println(word + " is not a Palindrome");
        }
    }
}