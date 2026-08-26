// -----------------------------------------------------------------------------
// Test.java -- a SECOND class with its own main, beside Main.java.
//
// Two classes may both declare main. javac compiles both; `java Test` runs the
// one you named. Open this file, press Run, and watch the header change to
// "runs Test.java" and the filled marker move onto this row in the tree.
//
// It also CALLS Main.main(args), so one file proves three things at once:
//   1. the file you are VIEWING is the file that runs,
//   2. a cross-file reference still resolves -- Main and Greeter are compiled
//      too, they are simply not the entry,
//   3. two main methods are legal Java, not an error.
//
// Press Run here  ->  Test ran first.
//                     Main ran. Greeter says: Hello, Revquix!
//                     Test finished.
// -----------------------------------------------------------------------------
public class Test {

    public static void main(String[] args) {
        System.out.println("Test ran first.");
        Main.main(args);
        System.out.println("Test finished.");
    }
}
