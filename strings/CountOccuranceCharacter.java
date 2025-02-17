package strings;

public class CountOccuranceCharacter {

    public static void countOccuranceCharacter(String str) {
        int[] counter = new int[256];
        int length = str.length();

        for (int i = 0; i < length; i++) {
            counter[str.charAt(i)]++;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " " + counter[i]);
            }
        }
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();
        countOccuranceCharacter(string);
    }
}
