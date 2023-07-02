public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(255);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        while (number > 0) {
            int lastNumber = number % 10;
            switch (lastNumber) {
                case 0:
                    System.out.print("ZERO" + " ");
                    break;
                case 1:
                    System.out.print("ONE" + " ");
                    break;
                case 2:
                    System.out.print("TWO" + " ");
                    break;
                case 3:
                    System.out.print("THREE" + " ");
                    break;
                case 4:
                    System.out.print("FOUR" + " ");
                    break;
                case 5:
                    System.out.print("FIVE" + " ");
                    break;
                case 6:
                    System.out.print("SIX" + " ");
                    break;
                case 7:
                    System.out.print("SEVEN" + " ");
                    break;
                case 8:
                    System.out.print("EIGHT" + " ");
                    break;
                case 9:
                    System.out.print("NINE" + " ");
                    break;
            }
            number = number / 10;
        }
        reverse();
    }

    public static int reverse(int number) {
        int originalNumber = number;
        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        return reverse;
    }
}

