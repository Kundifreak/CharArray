import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = scanner.nextLine();// read user input

        int[] freq = new int[str.length()];

        char string[] = str.toCharArray(); // creates a character array

        for (int i = 0; i < str.length(); i++) { // iterates each index to zero and starts with each index at 1
            freq[i] = 1;

            for (int j = i + 1; j < str.length(); j++) { // if the same letter is seen then the frequency increases
                if (string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0'; // This equals zero so it doesn't count as an extra letter

                }
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (string[i] != ' ' && string[i] != '0') { // This wont count the spaces in the sentence
                System.out.println(string[i] + "-" + freq[i]);
            } // abc

        }
    }
}