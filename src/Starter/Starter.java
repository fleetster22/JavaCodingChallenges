package Starter;

import java.util.regex.*;

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

    public static String RemoveBalloon(String str) {

        String result = str.toLowerCase();

        // Pattern pattern = Pattern.compile(" (\\B+n\\B+) ");
        // Matcher matcher = pattern.matcher(result);

        // if (matcher.find()) {
        // String theGroup = matcher.group(1);

        // System.out.format("'%b\n'", theGroup);
        // System.out.println(theGroup);
        // }

        int idx = result.indexOf("balloons");

        if (result.length() >= 8 && result.contains("balloons")) {

            // return result.substring(idx, (idx + 7));
            return result.substring(0, idx) + result.substring(idx + 8, result.length());
        }
        return "false";
    }

    public static String BalloonSpellCheck(String str) {
        String result = str.toLowerCase();
        int idxB = result.indexOf("b");

        if (result.length() >= 8 && result.contains("balloons")) {

            // return result.substring(idx, (idx + 7));
            return result.substring(0, idxB) + result.substring(idxB + 8, result.length());
        }

        return String.valueOf(idxB);
    }

    public static String SpellChecker(String str) {

        String[] correct = str.split("@", 5);
        return correct[0];
    }

    // true of 1-3 e's
    public static Integer Test(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e')
                count++;

        }
        return count;
    }

    public static int LargestNumber(int a, int b, int c) {

        return 0;
    }

    public static int ClosestToTen(int a, int b, int c)
    // hint Math.abs()
    {
        return 0;

    }

    public static String EveryXChar(String str, int x) {
        // return every other character in a sting
        return str;

    }

}
