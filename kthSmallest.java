import java.util.Arrays;
import java.util.Scanner;

public class kthSmallest {
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

        System.out.println("Enter the value of k : ");
        int k=scan.nextInt();

        Soluation obj=new Soluation();
        System.out.println("Kth Smallest Number is : "+ obj.getKthSmallest(arr,k));
    }    
}

class Soluation{
    public static int  getKthSmallest(int[] arr,int k){

        Arrays.sort(arr);

        //If Invaild index return -1
        if(k>arr.length){
            return -1;
        }
        return arr[k-1];
    }
}

