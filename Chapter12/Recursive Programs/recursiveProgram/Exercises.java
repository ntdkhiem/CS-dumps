public class Exercises {

    public static void main(String args[]) {
        System.out.println(doubleDigits(-234));
        System.out.println(repeat("hello", 6));
    }
    
    public static int doubleDigits(int number) {
        if (number < 0) {
            return -1 * doubleDigits(-1 * number);
        }
        else if (number > 0) {
            return doubleDigits(number / 10) * 100 + number % 10 * 11;
        }
        return 0;
    }
    
    public static String repeat(String s, int n) {
        if (n == 0) {
            return "";
        }
        return s + repeat(s,n-1);
    }
}