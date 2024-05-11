// Java program to reverse a string
public class StringReversal {
    public static String reverseString(String str) {
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        return reversedStr.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }
}