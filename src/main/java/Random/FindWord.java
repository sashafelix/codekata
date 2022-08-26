package Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWord {
    public static void main(String[] args) {
        Object[] input = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        System.out.println(findNeedle(input));

    }

    public static String findNeedle(Object[] haystack){
        int index = Arrays.asList(haystack).indexOf("needle");
        return "found the needle at position " + index;
    }
}
