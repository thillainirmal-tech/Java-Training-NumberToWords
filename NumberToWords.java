public class NumberToWords {

    public static int reverse(int number) {

        int reverse = 0;
        while (number != 0) {
            // Multiply by 10 and add last digit (number % 10)
            reverse = reverse * 10 + number % 10;
            number /= 10; // Discard last digit
        }
        return reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reverse = reverse(number);

        // Calculate leading zeroes
        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        // Print digits as words
        while (reverse != 0) {
            int lastDigit = reverse % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reverse /= 10;
        }

        // Print leading zeroes
        for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        System.out.println("Number: 123");
        numberToWords(123);
        
        System.out.println("\nNumber: 1010");
        numberToWords(1010);
        
        System.out.println("\nNumber: 1000");
        numberToWords(1000);
        
        System.out.println("\nNumber: 0");
        numberToWords(0);
        
        System.out.println("\nNumber: -12 (Invalid Case)");
        numberToWords(-12);
    }
}
