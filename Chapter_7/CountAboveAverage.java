public class CountAboveAverage {

    public static int countAboveAverage(int[] data) {

        int count = 0;
        int sum = 0;

        for (int i = 0; i < data.length; i++) {

            if (i == 0) {
                sum = data[i];
                continue;
            }

            double average = (double) sum / i;

            if (data[i] > average) {
                count++;
            }

            sum += data[i];
        }

        return count;
    }

    public static void main(String[] args) {

        int[] numbers = {100, 200, 150, 300};

        int result = countAboveAverage(numbers);

        System.out.println("Result: " + result);
    }
}
