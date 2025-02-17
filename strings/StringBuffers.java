package strings;

public class StringBuffers {

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        //Reverse String
        StringBuffer stringBuffer = new StringBuffer(string);
        System.out.println(stringBuffer.reverse());

        //Set the Character in StringBuilder
        stringBuffer.setCharAt(0, 'M');
        System.out.println(stringBuffer);

        //Append
        stringBuffer.append(" Kumar");
        System.out.println(stringBuffer);

        //Insert
        stringBuffer.indexOf("A", 0);
        System.out.println(stringBuffer);

        //Delete
        stringBuffer.deleteCharAt(0);
        System.out.println(stringBuffer);

        stringBuffer.delete(2, 4);
        System.out.println(stringBuffer);
    }
}
