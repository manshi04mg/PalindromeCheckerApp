public class PalidromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "radar";

        // Convert string to character array
        char[] arr = word.toCharArray();

        // Two pointer variables
        int start = 0;
        int end = arr.length - 1;

        boolean isPalindrome = true;

        // Two pointer comparison
        while(start < end)
        {
            if(arr[start] != arr[end])
            {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
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