package strings;

public class ComprasionOfTwoStrings {
    public static void main(String[] args) {
        String a = "Rohit";
        String b = "Rohit";

        if (a == b) {
            System.out.println("String1 and String is Equal");
        } else {
            System.out.println("String1 and String is Not Equal");
        }

        String c = "Rohit";
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}
