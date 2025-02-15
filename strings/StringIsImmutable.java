package strings;

public class StringIsImmutable {
    public static void main(String[] args) {
        String string1 = "Ram";
        String string2 = string1;

        System.out.println(string1);
        System.out.println(string2);

        string1 = "Sita";
        System.out.println(string1);
        System.out.println(string2);
    }
}
