package Greetings;

import java.util.Locale;

public class Greetings {
    public static String greeting(String name){
        if (name.isBlank() || name.isEmpty()){
            return "Hello, my friend.";
        } else if(name.equals(name.toUpperCase(Locale.ROOT))){
            return ("Hello " + name + ("!")).toUpperCase(Locale.ROOT);
        } else {
            return "Hello, " + name;
        }
    }

    public static String greeting(String... names){
        if (names.length == 2){
            return "Hello, " + names[0] + " and " + names[1] + ".";
        } else if (names.length == 3){
            return "Hello, " + names[0] + ", " + names[1] + " and " + names[2] + ".";
        } else{
            return "Hello, " + names[0] + ", " + names[1] + ", " + names[2] + " and " + names[3] + ".";
        }
    }
}
