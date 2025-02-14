import java.util.Scanner;
import java.util.Arrays;
    class Arrrays{
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][]arr = new int[row][col];
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    arr[i][j] = sc.nextInt();
                
                }
            }
            System.out.println(Arrays.tostring[arr]);
            int[]columnsum = new int[col];
            for(int j=0;j<col;j++){
                for(int i=0;i<row;i++){
                    columnsum[i]+= arr[i][j];

                }
            }
            for(int j=0;j<col;j++){
                System.out.println("column"+ (j+1)+ 'i' + columnsum[j])
            }
        }
    }