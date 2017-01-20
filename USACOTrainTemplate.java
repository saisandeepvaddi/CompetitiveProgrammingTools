
/*
ID: sxv16081
LANG: JAVA
TASK: test
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class test {
	public static StringTokenizer st = null;
	public static BufferedReader buf = null;
	public static PrintWriter out = null;

	public static void main(String[] args) throws IOException {
		buf = new BufferedReader(new FileReader("test.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));

		// Your program starts here

		// Your program ends here

		buf.close();
		out.close();
	}

	public static String next() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(buf.readLine(), " ");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	public static int nextInt() {
		return Integer.parseInt(next());
	}

	public static long nextLong() {
		return Long.parseLong(next());
	}

}
