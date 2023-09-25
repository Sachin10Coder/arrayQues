import java.util.Scanner;

public class reverseArray {

    public static int[] getReverse(int[] arr) {

        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {

            // Swapping ith index value and (len-1)th index value
            arr[i] = arr[i] + arr[len - i-1] - (arr[len - i-1] = arr[i]);
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
        resArr = getReverse(arr);

        System.out.println("Your Reverse Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(resArr[i]+"  ");
        }
    }
}
