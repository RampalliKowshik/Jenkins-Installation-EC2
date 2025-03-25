import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input provided.");
            return;
        }
        String input = args[0];  // Use the first command-line argument
        System.out.println("Input: " + input);
        // Process input...
    }
}
