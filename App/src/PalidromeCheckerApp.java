public class PalidromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        String word = "madam";

        // Convert string to linked list
        Node head = null;
        Node tail = null;

        for(int i = 0; i < word.length(); i++)
        {
            Node newNode = new Node(word.charAt(i));

            if(head == null)
            {
                head = newNode;
                tail = newNode;
            }
            else
            {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Fast and slow pointer to find middle
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        Node current = slow;
        Node next = null;

        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Compare first and second half
        Node first = head;
        Node second = prev;

        boolean isPalindrome = true;

        while(second != null)
        {
            if(first.data != second.data)
            {
                isPalindrome = false;
                break;
            }

            first = first.next;
            second = second.next;
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