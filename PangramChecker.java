// Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z)


public class PangramChecker {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(sentence);
        System.out.println(isPangram);
    }

    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabet[Character.toLowerCase(c) - 'a'] = true;
            }
        }

        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }
}
