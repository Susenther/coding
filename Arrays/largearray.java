package Arrays;
import java.util.*;
public class largearray {

    static int largest(int []arr) {

        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
            max = arr[i];
        }
        return max;

    }
    

    public static void main(String [] args){
            Scanner ip = new Scanner(System.in);
            System.out.print("Enter the array size: ");
            int n = ip.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements: ");
            for(int i=0;i<n;i++)
            arr[i] = ip.nextInt();

            int res = largest(arr);
            System.out.println("Largest element in the array is: " + res );

             ip.close();


    }
    
    
}
