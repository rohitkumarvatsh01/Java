package strings;

public class CountTotalNumberOfWords {

    public static int countTotalNumberOfWords(String string) {
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        System.out.println("Total Count of Words in String: " + countTotalNumberOfWords(string));
    }
}
