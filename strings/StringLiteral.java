package strings;

public class StringLiteral {
    public static void main(String[] args) {
        String string1 = "Rohit";
        String string2 = "Rohit";

        System.out.println(string1);
        System.out.println(string2);

        string1.concat("Kumar");
        System.out.println(string1);

        string2 = string2.concat(" Kumar");
        System.out.println(string2);
    }
}
