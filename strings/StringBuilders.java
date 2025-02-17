package strings;

public class StringBuilders {

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        //Reverse String
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println(stringBuilder.reverse());

        //Set the Character in StringBuilder
        stringBuilder.setCharAt(0, 'M');
        System.out.println(stringBuilder);

        //Append
        stringBuilder.append(" Kumar");
        System.out.println(stringBuilder);

        //Insert
        stringBuilder.indexOf("A", 0);
        System.out.println(stringBuilder);

        //Delete
        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder);

        stringBuilder.delete(2, 4);
        System.out.println(stringBuilder);
    }
}
