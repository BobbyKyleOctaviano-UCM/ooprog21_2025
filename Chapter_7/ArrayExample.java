public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);

        numbers[2] = 99;

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
