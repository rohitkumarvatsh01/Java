package strings;

public class CreationOfString {
    public static void main(String[] args) {

        //Using String Literal
        String string1 = "Rohit";
        String string2 = "Rohit";
        System.out.println(string1);
        System.out.println(string2);

        //Using New Keyword
        String string3 = "Rohit";
        String string4 = "Rohit";
        System.out.println(string3);
        System.out.println(string4);

        System.out.println(string1 == string2);
        System.out.println(string2 == string3);
        System.out.println(string3 == string4);
        System.out.println(string1 == string4);

        System.out.println(string1.equals(string2));
        System.out.println(string2.equals(string3));
        System.out.println(string3.equals(string4));
        System.out.println(string1.equals(string4));
    }
}
