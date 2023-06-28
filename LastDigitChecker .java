/*Write a method named hasSameLastDigit with three parameters of type int. 
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false. */

public class MyClass {
    public static void main(String args[]) {

      System.out.println(hasSameLastDigit(10,547,101));
      System.out.println (isValid(999));
    }
    public static boolean hasSameLastDigit  (int numOne, int numTwo, int numThree){
        if (numOne<10||numOne>1000 || numTwo<10 ||numTwo>1000 ||numThree<10||numThree>1000){
            return false;
        }
        int lastNumOne=numOne%10;
        int lastNumTwo=numTwo%10;
        int lastNumThree=numThree%10;
        if (lastNumOne==lastNumTwo || lastNumOne==lastNumThree || lastNumTwo==lastNumThree){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isValid (int numFour){
        if (numFour<10||numFour>1000){
            return false;
        } else {
            return true;
        }
    }
}
