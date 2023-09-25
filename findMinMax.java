import java.util.Scanner;

public class findMinMax {

    static class Pair {
        public int min;
        public int max;

    }

    public static Pair getMinMax(int[] arr) {

        // Creating Pair class Object
        Pair minmax = new Pair();
        int i = 0;

        // Check array length is even or odd.
        //  If length is Even then assign min and max to first two element 
        // but if length is odd then assign min and max to only first element

        int len = arr.length;
        if (len % 2 == 0) {
            if (arr[0] > arr[1]) {
                minmax.max = arr[0];
                minmax.min = arr[1];
            } else {
                minmax.max = arr[1];
                minmax.min = arr[0];
            }
            i += 2;
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];

            i++;
        }

        // Research on Ramaining element

        while (i < len - 1) {

            if (arr[i] > arr[i + 1]) {
                if (arr[i] > minmax.max) {
                    minmax.max = arr[i];
                }
                if (arr[i + 1] < minmax.min) {
                    minmax.min = arr[i + 1];
                }

            } else {
                if (arr[i + 1] > minmax.max) {
                    minmax.max = arr[i + 1];
                }
                if (arr[i] < minmax.min) {
                    minmax.min = arr[i];
                }
            }
            i += 2;
        }

        return minmax;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Size of array
        System.out.println("Enter the size of the array : ");
        int n = scan.nextInt();

        // Delcaring the array
        int[] arr = new int[n];

        // Taking Input the array
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Pair resPair = getMinMax(arr);
        System.out.println("Maximum is : " + resPair.max + "\n Minimum is : " + resPair.min);

    }
}