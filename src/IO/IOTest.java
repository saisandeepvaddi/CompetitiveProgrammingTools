package IO;

import java.io.PrintWriter;

/**
 * About the code :
 */
public class IOTest {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        double[] arr = in.getDoubleArray(5);
        for (int i = 0; i < 5; i++) {
            out.println(arr[i]);
        }
        out.flush();
        out.close();
    }
}
