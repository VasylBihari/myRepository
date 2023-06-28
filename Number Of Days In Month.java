/*Write a method isLeapYear with a parameter of type int named year. 
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false. 
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false. 
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.*/

public class MyClass {
    public static void main(String args[]) {
        System.out.println (isLeapYear (1980));
        System.out.println (getDaysInMonth (12, 1976));
    }

    public static boolean isLeapYear (int year){
        if (year<1 || year>9999){
            return false;
        }else if(year%4!=0){
            return false;
        }else if (year%100!=0){
        return true;
        }else if (year%400!=0){
            return false;
        } else {
            return true;
        }
    }
    
    public static int getDaysInMonth(int month, int year) {
 
    if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
        return -1;
    }
    if (isLeapYear(year) && month == 2) {
        return 29;
    }
 
    switch (month) {
        case 11:
        case 4:
        case 6:
        case 9:
            return 30;
        case 2:
            return 28;
        default:
            return 31;
        }
    }
}



