package Starter;

public class Starter {

    // #1 - SumDoubler
    // Given the two int values, return their sum. If the two values are the same,
    // then return the sum doubled.
    // Example: 1+2 = 3; 2+2= 4*2 = 8;

    public static int sumDoubler(int a, int b) {
        int sum = 0;
        if (a == b) {
            sum = (a + b) * 2;
        } else {
            sum = a + b;
        }
        return sum;
    }

    // #2 - SleepingIn
    // Weekday is true if it is a weekday.
    // Vacation is true if we are on vacation.
    // We sleep in if it is not a weekday or we're on vacation.
    // Return true if we sleep in.

    public static boolean SleepingIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation) {
            System.out.println("Sleep in today!");
            return true;
        } else {
            System.out.println("Seize the day!");
        }
        return false;
    }

    // #3 - AllOrNothing
    // Return true if one and two are both true or both false.
    // If they are not both true or false - return false.

    public static boolean AllOrNothing(boolean one, boolean two) {
        if (one && two || !one && !two) {
            return true;
        } else {
            return false;
        }
    }

}
