In this challenge, your task is to write a method, with the name sumDigits, that has a single parameter named number, of type int, and it should return an int.
The method should only take a number that is a positive number. 
If a negative number is passed, it should return -1, meaning an invalid value was passed.
The method should parse out each digit from the number, and sum the digits up.
So if 125 is the value passed to the method, the code should sum each digit, in this case, 1 + 2 + 5, and return 8, as a value.
_______________________________________________________________________________________________________________________________________

public class MyClass {
    public static void main(String args[]) {
        
      System.out.println(sumDigits (555));
      System.out.println(sumDigits (-2));
      System.out.println(sumDigits (0));
      System.out.println(sumDigits (1000));
    }
    
    public static int sumDigits (int number){
        if (number<0){
            return -1;
        }
        int sum = 0;
        while (number>=10){
            int i=number%10;
            sum+=i;
            number = number/10;
        }
        sum+=number;
        return sum;
    }
}
