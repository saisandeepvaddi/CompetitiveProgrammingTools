package Utils;

/**
 * About the code :
 */
public class Utils {
    /*
    * Usage: Utils.GCD(a, b)*/
    public static int GCD(int a, int b) {
        while (b > 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
