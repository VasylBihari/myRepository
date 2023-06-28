/*Write a method named getEvenDigitSum with one parameter of type int called number. 
The method should return the sum of the even digits within the number. 
If the number is negative, the method should return -1 to indicate an invalid value.*/


public class Main {
    public static void main(String args[]) {
        System.out.println(getEvenDigitSum (554));
        System.out.println(getEvenDigitSum (-5));
        System.out.println(getEvenDigitSum (101));
    }
    public static int getEvenDigitSum (int number){
        if (number<0){
            return -1;
        }
        int sum = 0;
        while (number>=10){
            int i=number%10;
            if (i%2==0){
                sum+=i;
            }
            number = number/10;
            }
        if (number%2!=0){
            number=0;
        }
        return sum+number;
    }
}
