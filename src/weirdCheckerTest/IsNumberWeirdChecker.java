package weirdCheckerTest;

public class IsNumberWeirdChecker {

    public static String getIsNumWeirdMessage(int num) {
        String result;
        if (num % 2 == 1) {
            result = "Weird";
        }
        else if (2 <= num && num <= 5) {
                result = "Not Weird";
            }
            else if (6 <= num && num <= 20) {
                    result = "Weird";
                }
                else result = "Not Weird";
        return result;
    }
}
