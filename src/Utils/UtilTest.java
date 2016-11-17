package Utils;

/**
 * About the code :
 */
public class UtilTest {
    public static void main(String[] args) {
        int a = 192;
        int b = 234;
        int gcd = Utils.GCD(a, b);
        int lcm = Utils.LCM(a, b);
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
