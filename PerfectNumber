/*Write a method named isPerfectNumber with one parameter of type int named number. 
If number is < 1, the method should return false.
The method must calculate if the number is perfect. If the number is perfect, 
the method should return true; otherwise, it should return false.*/



public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(-16));
        System.out.println(isPerfectNumber(18));
    }
    public static boolean isPerfectNumber (int number){
        if (number<1){
            return false;
        }
        int i=1;
        int sum=0;
        for (i=1; i<=number;i++){
            if (number%i==0){
                sum=sum+i;
            }
            if (number == sum-number){
                return true;
            }
        }
        return false;
    }
}
