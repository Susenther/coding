import java.util.*;
    public class changevalue{
        public static void main(String [] args){
            int []arr = {0,10,15,20,25}
            change(arr);
            System.out.print(Arrays.toString(arr));
        }
    }

        static void change(int [] nums){
            nums [0] = 25;
        }