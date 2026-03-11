import java.util.Stack;

public class PalidromeCheckerApp {

    // Method 1: String reverse method
    public static boolean reverseMethod(String word)
    {
        String reverse = "";

        for(int i = word.length()-1; i >= 0; i--)
        {
            reverse = reverse + word.charAt(i);
        }

        return word.equals(reverse);
    }

    // Method 2: Stack method
    public static boolean stackMethod(String word)
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

    public static void main(String[] args) {

        String word = "madam";

        // Reverse method timing
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(word);
        long end1 = System.nanoTime();

        // Stack method timing
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(word);
        long end2 = System.nanoTime();

        // Results
        System.out.println("Reverse Method Result : " + result1);
        System.out.println("Reverse Method Time : " + (end1-start1) + " ns");

        System.out.println("Stack Method Result : " + result2);
        System.out.println("Stack Method Time : " + (end2-start2) + " ns");
    }
}