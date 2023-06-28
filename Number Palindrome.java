/*Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false. 
Check the tips below for more info about palindromes.*/



public class MyClass {
    public static void main(String args[]) {

      System.out.println(isPalindrome(122));
    }

    public static boolean isPalindrome(int number) {
    int originalNumber = number;
    int reverse = 0;
 
    if (number < 0) {
        number = number * -1;
        originalNumber = number;
    }
 
        while (number > 0) {
 
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        if (reverse == originalNumber) {
            return true;
        } else {
            return false;
        }
     }
 
}