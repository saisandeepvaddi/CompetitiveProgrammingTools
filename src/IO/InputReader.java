package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * IO input class :
 */
public class InputReader {
    private InputStream stream;
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        this.stream = stream;
        tokenizer = null;
        reader = new BufferedReader(new InputStreamReader(this.stream));
    }

    private String getNext() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine(), " ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tokenizer.nextToken();
    }

    public int getInt() {
        return Integer.parseInt(getNext());
    }

    public long getLong() {
        return Long.parseLong(getNext());
    }

    public String getString() {
        return getNext();
    }

    public double getDouble() {
        return Double.parseDouble(getNext());
    }

    public int[] getIntArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = getInt();
        }
        return arr;
    }

    public long[] getLongArray(int length) {
        long[] arr = new long[length];
        for (int i = 0; i < length; i++) {
            arr[i] = getLong();
        }
        return arr;
    }


    public double[] getDoubleArray(int length) {
        double[] arr = new double[length];
        for (int i = 0; i < length; i++) {
            arr[i] = getDouble();
        }
        return arr;
    }


    public String[] getStringArray(int length) {
        String[] arr = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = getString();
        }
        return arr;
    }

    public char[] getCharArray(int length) {
        char[] arr = new char[length];
        for (int i = 0; i < length; i++) {
            arr[i] = getNext().charAt(0);
        }
        return arr;
    }

}
