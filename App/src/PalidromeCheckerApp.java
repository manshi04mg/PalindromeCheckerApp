import java.util.Stack;

public class PalidromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create stack
        Stack<Character> stack = new Stack<Character>();

        // Push characters into stack
        for(int i = 0; i < word.length(); i++)
        {
            stack.push(word.charAt(i));
        }

        // Pop characters to form reverse string
        String reverse = "";

        while(!stack.isEmpty())
        {
            reverse = reverse + stack.pop();
        }

        // Compare original and reverse
        if(word.equals(reverse))
        {
            System.out.println(word + " is a Palindrome");
        }
        else
        {
            System.out.println(word + " is not a Palindrome");
        }
    }
}