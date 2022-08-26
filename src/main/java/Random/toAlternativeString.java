package Random;

import java.util.List;

public class toAlternativeString {
    public static String changeCase(String string) {
        char[] input = string.toCharArray();
        String output = "";
        for (int i = 0; i < input.length; i++) {
            if (Character.isUpperCase(input[i])){
                output += Character.toLowerCase(input[i]);
            } else {
                output += Character.toUpperCase(input[i]);
            }
        }
        return output;
    }
}
