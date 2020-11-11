package Starter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    // #4 - LargestNumber
    // Return the largest number from a, b, & c;

    public static int LargestNumber(int a, int b, int c) {

        if (a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;
    }

    // #5 - ClosestToTen
    // Given 2 int values, return whichever value is nearest to the value 10, or
    // return 0 in the event of a tie..
    // HINT: Math.abs()

    public static int ClosestToTen(int a, int b) {
        int target = 10;
        if (Math.abs(target - a) < Math.abs(target - b))
            return a;
        else
            return b;
    }

    // #6 - EveryXChar
    // Given a string. Return only every X char.
    // (x=1) abcdefg => abcdefg
    // (x=2) abcdefg => aceg
    // (x=3) abcdefg => adg

    public static String EveryXChar(String str, int x) {
        String s = "";

        for (int i = 0; i < str.length(); i += x) {
            s = s + str.charAt(i);

        }
        return s;
    }

    public static String RepeatStringXTimes(String str, int n, int x) {
        // n= number of characters, x=repeat times
        if (n > str.length()) {
            n = str.length();
        }
        String howManyChar = str.substring(0, n);
        String result = howManyChar.repeat(x);
        return result;
    }

    // public static int CountInArrX(int[] arr) {
    // int count = 0;
    // int result = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 2) {
    // count++;
    // }

    // }
    // return count;
    // }

    public static int NextToX(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == x && arr[i + 1] == x) {
                count++;
            }
        }
        return count;
    }

    public static String RockPaperScissor(String Player1, String Player2) {

        if (Player1.equalsIgnoreCase(Player2)) {
            return "It's a tie";
        } else if ((Player1 == "rock" && Player2 == "scissors") || (Player1 == "scissors" && Player2 == "paper")) {
            return "Player1 wins this round!";
        } else {
            return "Player2 wins this round!";
        }
    }

    public static long Factorial(long n) {
        long factorial = 1;

        for (long i = 1; i <= n; ++i) {
            factorial *= i;
        }
        return factorial;
    }

    // camelcase
    // Hello World remove space and return helloWorld
    // Stringbuilder / .append

    public static String CamelCase(String str) {

        String s = Stream.of(str.split("[^a-zA-Z0-9]"))
                .map(v -> v.substring(0, 1).toUpperCase() + v.substring(1).toLowerCase()).collect(Collectors.joining());
        String camelS = s.toLowerCase().substring(0, 1) + s.substring(1);

        return camelS;

    }

    public static int ReverseInt(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && digit > 7)
                return 0;
            if (result < Integer.MIN_VALUE / 10 || result == Integer.MIN_VALUE / 10 && digit < -8)
                return 0;
            result = result * 10 + digit;
        }
        return result;
    }

}
