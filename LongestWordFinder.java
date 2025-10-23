import java.util.Scanner;

public class LongestWordFinder {
    public static String findLongestWord(String sentence) {
        // Remove punctuation for clean comparison
        sentence = sentence.replaceAll("[^a-zA-Z0-9 ]", " ");
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        String longest = findLongestWord(sentence);
        System.out.println("Longest word: " + longest);
    }
}
