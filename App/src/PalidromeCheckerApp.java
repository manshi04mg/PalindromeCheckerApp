import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

// Stack Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word)
    {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < word.length(); i++)
        {
            stack.push(word.charAt(i));
        }

        String reverse = "";

        while(!stack.isEmpty())
        {
            reverse = reverse + stack.pop();
        }

        return word.equals(reverse);
    }
}

// Deque Strategy Implementation
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word)
    {
        Deque<Character> deque = new LinkedList<Character>();

        for(int i = 0; i < word.length(); i++)
        {
            deque.add(word.charAt(i));
        }

        while(deque.size() > 1)
        {
            if(deque.removeFirst() != deque.removeLast())
            {
                return false;
            }
        }

        return true;
    }
}

// Main class
public class PalidromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        // Choose strategy dynamically
        PalindromeStrategy strategy;

        // You can change strategy here
        strategy = new StackStrategy();
        // strategy = new DequeStrategy();

        boolean result = strategy.checkPalindrome(word);

        if(result)
        {
            System.out.println(word + " is a Palindrome");
        }
        else
        {
            System.out.println(word + " is not a Palindrome");
        }
    }
}