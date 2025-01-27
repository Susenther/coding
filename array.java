public class array {
    public static void main(String [] args){
        int number[] = {10,20,30,40,50};
        System.out.println("original array");
        for(int i = 0;i<number.length;i++){
            System.out.print (number[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed array");
        for(int i =4;i>=0;i--){
            System.out.print(number[i]+" ");
        }

    }
    
}
