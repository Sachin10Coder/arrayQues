import java.util.Scanner;

public class SortZeroOneTwo {

    public static int[] getSorted(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high && mid < arr.length) {

            // We have to make three partiation
            // if our value is zero then put it into low range, if 1 then mid range and if 2
            // high range

            if (arr[mid] == 0) {
                // Swapping
                arr[mid] = arr[mid] + arr[low] - (arr[low] = arr[mid]);
                low++;
                mid++;
            }

            else if (arr[mid] == 2) {
                arr[mid] = arr[mid] + arr[high] - (arr[high] = arr[mid]);
                high--;
            } else {

                mid++;
            }

        }
        return arr;

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
            System.out.println("Enter the value of array at index [" + i + "] : ");
            arr[i] = scan.nextInt();
        }

        int[] resArr = new int[n];
        resArr = getSorted(arr);

        System.out.println("Your Sorted Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(resArr[i]+"  ");
        }
    }
}
