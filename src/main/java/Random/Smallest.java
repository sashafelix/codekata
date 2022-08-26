package Random;

public class Smallest {
    public static void main(String[] args) {
        System.out.println(findSmallestint(new int[]{34, 15, 88, 2}));
    }
    public static int findSmallestint (int[] args){
        int test = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < test){
                test = args[i];
            }
        }
        return test;
    }
}
