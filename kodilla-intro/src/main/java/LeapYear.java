public class LeapYear {
    public static void main(String[] args) {
        int a = 366;
        int b = 4;
        int c = 100;
        int d = 400;
        boolean result = LeapYear();
        System.out.println(result);

        if (a%b < 1 && a%c > 0 || a%d < 1); {
            System.out.println("It's a leap year");
        }
    }
    public static boolean LeapYear() {
        boolean isLeap = true;
        return isLeap;

    }

}


