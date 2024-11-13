import edu.princeton.cs.algs4.StdOut;
public class HelloGoodbye {
    public static void main(String[] args) {
        if (args.length == 0) {
            StdOut.println("Hello, World!");
            StdOut.println("Goodbye, World!");
        } 
        else if (args.length == 2) {
            StdOut.println("Hello "  + args[0] +" and " + args[1] +".");
            StdOut.println("Goodbye "  + args[1] +" and " + args[0] +".");
        } 
        else {
            StdOut.println("Hello, " + args[0] + "!");
            StdOut.println("Goodbye, " + args[0] + "!");
        }
    }
}
