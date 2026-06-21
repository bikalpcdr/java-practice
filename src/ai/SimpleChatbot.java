package ai;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/6/21
 */
public class SimpleChatbot {
    public static Map<String, String> staticResponses = new HashMap<>();
    static{
        staticResponses.put("hello", "Hi there! How can I help you?");
        staticResponses.put("how are you", "I'm just a program, but I'm doing great!");
        staticResponses.put("name", "I'm JavaBot, your friendly AI assistant!");
        staticResponses.put("bye", "Goodbye! Have a great day!");
        staticResponses.put("help", "You can ask me about hello, how are you, name, bye");
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🤖 JavaBot: Hello! Type 'bye' to exit.");

        while (true) {
            System.out.println("You: ");
            String input = scanner.nextLine().toLowerCase().trim();

            if (input.equals("bye")) {
                System.out.println("🤖 JavaBot: " + staticResponses.get("bye"));
                break;
            }

            String response = staticResponses.getOrDefault(input,
                    "I don't understand that. Try 'help' for options.");
            System.out.println("🤖 JavaBot: " + response);
        }
        scanner.close();
    }
}
