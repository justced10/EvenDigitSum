public class Main {
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789)); // 20

        System.out.println(getEvenDigitSum(252));       // 4

        System.out.println(getEvenDigitSum(-22));       // -1

    }

    public static int getEvenDigitSum(int number) {

        // Return -1 if the number is negative

        if (number < 0) {

            return -1;

        }



        int sum = 0;



        // Iterate through each digit of the number

        while (number > 0) {

            int digit = number % 10;  // Get the last digit
            // Check if the digit is even

            if (digit % 2 == 0) {

                sum += digit;  // Add to sum if even

            }



            number /= 10;  // Remove the last digit

        }



        return sum;

    }

}



