package WEEK_08;
import java.util.Scanner;

public class StringHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking string input from user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // String length
        System.out.println("Length of the string: " + str.length());

        // Concatenation
        System.out.print("Enter another string to concatenate: ");
        String anotherStr = scanner.nextLine();
        String concatenatedStr = str.concat(anotherStr);
        System.out.println("Concatenated string: " + concatenatedStr);

        // Character at specific index
        System.out.print("Enter an index to get the character: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < str.length()) {
            char charAtIndex = str.charAt(index);
            System.out.println("Character at index " + index + ": " + charAtIndex);
        } else {
            System.out.println("Index out of bounds!");
        }

        // Substring
        System.out.print("Enter the starting index for substring: ");
        int startIndex = scanner.nextInt();
        scanner.nextLine(); // consume newline
        if (startIndex >= 0 && startIndex < str.length()) {
            String subStr = str.substring(startIndex);
            System.out.println("Substring from index " + startIndex + ": " + subStr);
        } else {
            System.out.println("Starting index out of bounds!");
        }

        // Index of a string
        System.out.print("Enter a string to find its index: ");
        String searchString = scanner.nextLine();
        int indexOfSearchString = str.indexOf(searchString);
        if (indexOfSearchString != -1) {
            System.out.println("Index of '" + searchString + "': " + indexOfSearchString);
        } else {
            System.out.println("String not found!");
        }

        // Replace
        System.out.print("Enter a character to replace in the string: ");
        char oldChar = scanner.nextLine().charAt(0);
        System.out.print("Enter a character to replace with: ");
        char newChar = scanner.nextLine().charAt(0);
        String replacedStr = str.replace(oldChar, newChar);
        System.out.println("String after replacement: " + replacedStr);

        // Uppercase
        System.out.println("Uppercase string: " + str.toUpperCase());

        // Lowercase
        System.out.println("Lowercase string: " + str.toLowerCase());

        // Trim
        System.out.println("Enter a string with leading/trailing spaces: ");
        String strWithSpaces = scanner.nextLine();
        String trimmedStr = strWithSpaces.trim();
        System.out.println("String after trimming: " + trimmedStr);

        // Split
        System.out.println("Enter a string with comma-separated values: ");
        String splitStr = scanner.nextLine();
        String[] values = splitStr.split(",");
        System.out.println("Values:");
        for (String value : values) {
            System.out.println(value.trim()); // Trim each value to remove any leading/trailing spaces
        }

        // StartsWith
        System.out.print("Enter a string to check if it starts with: ");
        String startsWithString = scanner.nextLine();
        boolean startsWith = str.startsWith(startsWithString);
        System.out.println("Starts with '" + startsWithString + "': " + startsWith);

        // EndsWith
        System.out.print("Enter a string to check if it ends with: ");
        String endsWithString = scanner.nextLine();
        boolean endsWith = str.endsWith(endsWithString);
        System.out.println("Ends with '" + endsWithString + "': " + endsWith);

        scanner.close();
    }
}

