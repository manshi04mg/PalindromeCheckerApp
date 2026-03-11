import java.util.Deque;
import java.util.LinkedList;

public class PalidromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "racecar";

        // Create Deque
        Deque<Character> deque = new LinkedList<Character>();

        // Insert characters into deque
        for(int i = 0; i < word.length(); i++)
        {
            deque.add(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare first and last characters
        while(deque.size() > 1)
        {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if(first != last)
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