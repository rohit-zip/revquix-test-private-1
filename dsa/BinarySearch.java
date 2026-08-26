package dsa;

// -----------------------------------------------------------------------------
// dsa/BinarySearch.java -- the SECOND main in this package.
//
// Compare with dsa/TwoSum.java: two classes, two mains, one folder, no conflict.
// Java is happy to compile both; the one you press Run on is the one that runs.
//
// (C++ cannot do this -- two main() functions refuse to link. Open the "C++ run
// targets" project to see how that case is handled instead.)
//
// Press Run here  ->  BinarySearch over [1, 3, 5, 7, 9, 11]
//                     index of 9 -> 4
// -----------------------------------------------------------------------------
public class BinarySearch {

    public static void main(String[] args) {
        int[] sorted = { 1, 3, 5, 7, 9, 11 };
        int needle = 9;

        System.out.println("BinarySearch over " + ArrayUtils.show(sorted));
        System.out.println("index of " + needle + " -> " + find(sorted, needle));
    }

    static int find(int[] sorted, int needle) {
        int low = 0;
        int high = sorted.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sorted[mid] == needle) {
                return mid;
            }
            if (sorted[mid] < needle) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
