public class Main {


    public static boolean isLeapYear(int year){
        if (year % 400 == 0) return true;
        else if(year % 4 == 0) {
            return year % 100 != 0;
        }
        else return false;
    }// some changes
}