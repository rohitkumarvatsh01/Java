package strings;

public class CheckStringRotationEachOther {

    public static void checkStringRotationEachOther(String string1, String string2) {
        String string3 = string1 + string2;

        if (string3.contains(string2)) {
            System.out.println("String1 and String2 is Rotation Each Other");
        } else {
            System.out.println("String1 and String2 is Not Rotation Each Other");
        }
    }

    public static void main(String[] args) {
        String string1 = StringInput.inputOfString();
        String string2 = StringInput.inputOfString();

        checkStringRotationEachOther(string1, string2);
    }
}
