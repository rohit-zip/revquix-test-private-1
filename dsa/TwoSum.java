package dsa;

// -----------------------------------------------------------------------------
// dsa/TwoSum.java -- one DSA solution, with its OWN main.
//
// THIS FOLDER IS THE POINT OF THE WHOLE EXAMPLE: it holds two classes that each
// declare main, plus a helper shared by both. That is a folder of solutions
// where every file is its own program -- exactly how DSA practice is organised,
// and exactly what used to be impossible here, because Run always executed
// Main.java no matter which file was open.
//
// Open the solution you are working on and press Run. Nothing else to set up.
//
// Press Run here  ->  TwoSum over [2, 7, 11, 15], target 9
//                     indices -> [0, 1]
// -----------------------------------------------------------------------------
public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;

        System.out.println("TwoSum over " + ArrayUtils.show(numbers) + ", target " + target);
        System.out.println("indices -> " + ArrayUtils.show(solve(numbers, target)));
    }

    static int[] solve(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }
}
