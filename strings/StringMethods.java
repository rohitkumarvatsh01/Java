package strings;

public class StringMethods {
    public static void main(String[] args) {
        String string1 = "ROHIT";
        String string2 = "Rohit";
        String string3 = " Kumar";

        //Lower Case
        System.out.println(string1.toLowerCase());
        System.out.println(string2.toLowerCase());

        //Upper Case
        System.out.println(string1.toUpperCase());
        System.out.println(string1.toUpperCase());

        //Concat two String
        System.out.println(string1.concat(string3));
        System.out.println(string2.concat(string3));

        //Length of String
        System.out.println(string1.length());
        System.out.println(string2.length());

        //Remove white space
        String string4 = "     Raja     ";
        System.out.println(string4);
        System.out.println(string4.trim());

        //Check String is empty or not
        String string5 = "";
        System.out.println(string5.isBlank());
        System.out.println(string5.isEmpty());

        //Find or get char in String
        System.out.println(string1.indexOf("O"));
        System.out.println(string2.charAt(1));

        //Check Equal String
        System.out.println(string1.equals(string2));
        System.out.println(string1 == string2);

        //Replace Character in String
        System.out.println(string1.replace("R", "M"));
        System.out.println(string2.replace("R", "M"));
    }
}
