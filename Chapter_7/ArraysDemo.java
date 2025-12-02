import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] num = new int[5];    

        display("Original array:", num);

        Arrays.fill(num, 8);      
        display("After filling with 8s:", num);

        num[2] = 6;                
        num[4] = 3;                 
        display("After changing two values:", num);

        Arrays.sort(num);          
        display("After sorting:", num);
    }

    public static void display(String message, int[] num) {
        System.out.print(message + " ");
        for (int value : num) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
