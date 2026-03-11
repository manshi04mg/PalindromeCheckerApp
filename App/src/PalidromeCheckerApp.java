public class PalidromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String original = "level";

        // Variable to store reversed string
        String reverse = "";

        // Reverse using for loop
        for(int i = original.length()-1; i >= 0; i--)
        {
            reverse = reverse + original.charAt(i);
        }

        // Compare original and reversed string
        if(original.equals(reverse))
        {
            System.out.println("Original String : " + original);
            System.out.println("Reversed String : " + reverse);
            System.out.println("Result : Palindrome");
        }
        else
        {
            System.out.println("Original String : " + original);
            System.out.println("Reversed String : " + reverse);
            System.out.println("Result : Not a Palindrome");
        }
    }
}