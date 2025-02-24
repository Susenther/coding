
package Arrays ;
import java.util.*;

public class Segregate {

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void segregatei(int[] a, int n) {
        int i = 0, j = n - 1;
        while (i < j) {
            // Move i forward for positive elements
            while (i < j && a[i] < 0) 
                i++;
            // Move j backward for negative elements
            while (i < j && a[j] >= 0) 
                j--;
            
            // Swap if needed
            if (i < j) {
                swap(a, i, j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = ip.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        segregatei(arr, n);
        System.out.println("Segregated Array: " + Arrays.toString(arr));

        ip.close();
    }
}
