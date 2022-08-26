package Random;

import java.util.ArrayList;
import java.util.List;

public class reverseWords {
    public static void main(String[] args) {
        reverseWords("this is a test");
    }

    public static String reverseWords(String original) {
        String words[] = original.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString() + " ";
        }
        return reverseWord.trim();
    }
}
