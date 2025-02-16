package strings;

import java.util.Stack;

public class ReverseStringUsingStack {

    public static String reverseStringUsingStack(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            reverse += stack.pop();
        }
        return reverse;
    }

    public static void main(String[] args) {
        String string = StringInput.inputOfString();

        System.out.println(reverseStringUsingStack(string));
    }
}
