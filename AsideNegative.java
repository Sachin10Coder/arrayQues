import java.util.Scanner;

public class AsideNegative {

    public static int[] getNegativeAside(int[] arr){
        int left=0;
        int right=arr.length-1;

        while(left<=right && left<arr.length){
            if(arr[left]>0){
                arr[left]=arr[left]+arr[right]-(arr[right]=arr[left]);
                right--;
            }else{
                left++;
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
        resArr = getNegativeAside(arr);

        System.out.println("Your Sorted Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(resArr[i]+"  ");
        }
    }
}
