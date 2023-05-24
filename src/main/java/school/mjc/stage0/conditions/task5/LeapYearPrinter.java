package school.mjc.stage0.conditions.task5;

import java.util.Scanner;

public class LeapYearPrinter {
    public static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        int year = scanner.nextInt();
        isLeapYear(year);
    }
}
