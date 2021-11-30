// TNPG: All Brians (Brian Kang, Brian Wang, Ryan Lau)
// APCS
// HW40 -- Demand A Raise
// 2021-11-29
// time spent: 1.0 hrs

/*
DISCOVERIES
    0. variables, methods, classes cannot start with a number [0 - 9]
UNRESOLVED QUESTIONS
    0.
*/


public class TwoDimArray {
    public static String arrayToString(int[] arr) {
        String res = "[";
        for (int element : arr) {
            res = res + element + ", ";
        }
        res = res.substring(0, res.length() - 2);
        res += "]";

        return res;
    }

    public static String twoDimArrayToString(int[][] arr) {
        String res = "[\n";
        for (int[] subarr : arr) {
            res = res + "    " + arrayToString(subarr) + ",\n";
        }
        res = res.substring(0, res.length() - 2);
        res += "\n]";

        return res;
    }

    public static void fillTwoDimArray(int[][] arr) {
        fillTwoDimArray(arr, 0, 10);
    }

    /**
     * fills array with random ints from [min, max)
     */
    public static void fillTwoDimArray(int[][] arr, int min, int max) {
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                int randInt = (int) (Math.random() * (max - min)) + min;
                arr[j][k] = randInt;
            }
        }
    }

    public static int freqTwoDimArray(int[][] arr, int target) {
        int counter = 0;
        for (int[] subarr : arr) {
            for (int ele : subarr) {
                if (ele == target) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int[] linSearchTwoDimArray(int[][] arr, int target) {
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                if (arr[j][k] == target) {
                    return new int[] {j, k};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[][] a = new int[5][5];
        System.out.println(twoDimArrayToString(a));
        System.out.println();
        fillTwoDimArray(a, 0, 100);
        System.out.println(twoDimArrayToString(a));
        System.out.println();
        fillTwoDimArray(a);
        System.out.println(twoDimArrayToString(a));
        System.out.println();
        System.out.println("5 appears in the 2D array " + freqTwoDimArray(a, 5) + " time(s)");
        System.out.println("5 appears in the 2D array first at " + arrayToString(linSearchTwoDimArray(a, 5)));
    }
}
