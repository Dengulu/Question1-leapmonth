/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.leapmonth;

/**
 *
 * @author DERRICK
 */
import java.util.Scanner;

public class Leapmonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        
        boolean isLeapMonth = isLeapMonth(year, month);

        
        if (isLeapMonth) {
            System.out.println("The given month " + month + " in year " + year + " is a leap month.");
        } else {
            System.out.println("The given month " + month + " in year " + year + " is not a leap month.");
        }
    }

    public static boolean isLeapMonth(int year, int month) {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (month % 100 != 0);
        isLeapMonth = isLeapMonth || (month % 400 == 0);
        return isLeapMonth;
    }
}

