# CompetitiveProgrammingTools

Code stubs that can be used in Java Programming. Useful in Competitive Programming.  
Files are available in [src](./src)  
##IO  [Link](./src/IO/)
* __InputReader.java__  [Link](./src/IO/InputReader.java)  
  * Faster IO tools than Scanner.  
  * Reads trivial int, long, double, String inputs.  
  * Reads int, long, double, String, Char Arrays.  
```
Usage:
   
InputReader in = new InputReader(System.in);
int a = in.nextInt(); // long, double, string inputs are similar
int[] arr = in.getIntArray(5); // Reads 5 integers into array.
```
  
##Utils  [Link](./src/Utils)
* __Utils.java__  [Link](./src/Utils/Utils.java)
  * Common Utilities
    * GCD
    * LCM
    * Graphs
```
Usage:
   
int gcd = Utils.GCD(3, 5);
int lcm = Utils.LCM(3, 5);
--- Graphs ---
Utils.Graph graph = new Utils.Graph();
/* For matrix representation of graph, pass true in constructor for directed graph */
Utils.MatrixGraph graph = new Utils.MatrixGraph(); 
```
