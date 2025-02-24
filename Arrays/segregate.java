import java.util.*;

public class segregate {

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void segregatei(int[] a, int n) {

        int i = 0, j = n - 1;
        while (i < j) {

            while (a[i] < 0) // if it is -ve
                i++;
            while (a[j] >= 0)
                j--;

            if (i < j)
                swap(a, i, j);
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
        System.out.println(Arrays.toString(arr));

        ip.close();

    }

}
