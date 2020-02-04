package pkg;

public class IsNumberWeirdChecker {

    private int num;
    public IsNumberWeirdChecker() {
    }

    public IsNumberWeirdChecker(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String isWeird() {
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
        //System.out.println(num + " - " + result);
        return result;
    }
}
