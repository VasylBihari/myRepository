/*Write a method named hasSharedDigit with two parameters of type int. 
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.*/


public class MyClass {
    public static void main(String args[]) {

      System.out.println(hasSharedDigit(55,25));
      System.out.println(hasSharedDigit(-55,25));
      System.out.println(hasSharedDigit(15,20));
    }
    public static boolean hasSharedDigit (int numberOne, int numberTwo){
        if(numberOne<10||numberOne>99||numberTwo<10||numberTwo>99){
            return false;
        }
        int lastNumberOne=numberOne%10;
        int firstNumberOne=numberOne/10;
        int lastNumberTwo=numberTwo%10;
        int firstNumberTwo = numberTwo/10;
        if (lastNumberOne==lastNumberTwo || lastNumberOne==firstNumberTwo || firstNumberOne==lastNumberTwo || firstNumberOne==firstNumberTwo){
            return true;
        } else {
            return false;
        }
    }
}
