import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text:");
        String text = scanner.nextLine();

        // Convert to lowercase and split on non-word characters
        String[] words = text.toLowerCase().split("\\W+");

        // TreeMap to store word frequencies
        TreeMap<String, Integer> wordFreq = new TreeMap<>();

        for (String word : words) {
            if (word.isEmpty()) continue; // skip empty entries
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        // Display the word frequencies in sorted (alphabetical) order
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();
    }
}
