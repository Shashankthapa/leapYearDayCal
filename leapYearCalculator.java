public class leapYearCalculator {
    public static void main(String args[]){
        System.out.println("It is " + isALeap(2020) + " that it is leap year.");
        System.out.println("3rd Month of 2020 has : " + dayCal(3,2020) + " days");
    }
    public static boolean isALeap(int year){
        boolean status = false;
        if((year < 0) && (year >= 9999))
            status = false;
        else if(((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0))
            status = true;

        return status;
    }
    public static int dayCal(int month,int year){
        int status = 0;
        if((month < 0 && month > 12)||(year < 0 && year > 9999))
            status = -1;
        if(isALeap(year) == true) {//if a leap year.
            switch (month) {
                case 1:
                    status = 31;
                    break;
                case 2:
                    status = 29;
                    break;
                case 3:
                    case5:
                    case7:
                    case9:
                    case11:
                    status = 31;
                    break;
                case 4:
                case 6:
                case 8:
                case 10:
                case 12:
                    status = 30;
                    break;
                default:
                    status = 0;
                    break;
            }
        }else if(isALeap(year) == false){//if not a leap year.
                switch (month) {
                    case 1:
                        status = 31;
                        break;
                    case 2:
                        status = 29;
                        break;
                    case 3:
                        case5:
                        case7:
                        case9:
                        case11:
                        status = 31;
                        break;
                    case 4:
                    case 6:
                    case 8:
                    case 10:
                    case 12:
                        status = 30;
                        break;
                    default:
                        status = 0;
                        break;
                }
        }
        return status;
    }
}
