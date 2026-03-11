public class PalidromeCheckerApp {

    public static void main(String[] args) {

        // Original string with spaces and mixed case
        String input = "Madam In Eden Im Adam";

        // Normalize string (lowercase + remove spaces)
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Reverse normalized string
        String reverse = "";

        for(int i = normalized.length()-1; i >= 0; i--)
        {
            reverse = reverse + normalized.charAt(i);
        }

        // Compare
        if(normalized.equals(reverse))
        {
            System.out.println("Original String : " + input);
            System.out.println("Normalized String : " + normalized);
            System.out.println("Result : Palindrome");
        }
        else
        {
            System.out.println("Result : Not a Palindrome");
        }
    }
}
