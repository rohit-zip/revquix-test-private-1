package dsa;

// -----------------------------------------------------------------------------
// dsa/ArrayUtils.java -- the shared helper for both solutions in this package.
//
// No main, so pressing Run here gives:
//     Error: Main method not found in class dsa.ArrayUtils
//
// Note the name in that message: dsa.ArrayUtils. The package comes from the
// DECLARATION on line 1, never from the folder name -- which is why a tree
// rooted at src/ would still be dsa.ArrayUtils and not src.dsa.ArrayUtils.
// -----------------------------------------------------------------------------
public class ArrayUtils {
    public static String show(int[] values) {
        StringBuilder out = new StringBuilder("[");
        for (int i = 0; i < values.length; i++) {
            if (i > 0) {
                out.append(", ");
            }
            out.append(values[i]);
        }
        return out.append("]").toString();
    }
}
