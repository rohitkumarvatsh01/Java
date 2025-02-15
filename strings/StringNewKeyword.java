package strings;

public class StringNewKeyword {
    public static void main(String[] args) {
        String string1 = "Rohit";
        System.out.println(string1);

        String string2 = "Rohit";
        System.out.println(string2);

        string1.concat(string2);
        System.out.println(string1);

        string2 = string2.concat(" Kumar");
        System.out.println(string2);
    }
}
