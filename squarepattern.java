public class squarepattern {

    public static void main(String[] args) {
        int n = 5; // Adjust the size of the square here

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= n; j++) {
                // Print "*" for each position in the square
                System.out.print("* "); 
            }
            // Move to the next line after each row
            System.out.println(); 
        }
    }
}