package Dateclass;

import java.util.Scanner;
public class DateValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày (dd): ");
        int day = scanner.nextInt();
        System.out.print("Nhập tháng (mm): ");
        int month = scanner.nextInt();
        System.out.print("Nhập năm (yyyy): ");
        int year = scanner.nextInt();
        if (isValidDate(day, month, year)) {
            System.out.println("Ngày tháng năm hợp lệ!");
            if (isLeapYear(year)) {
                System.out.println(year + " là năm nhuận");
            } else {
                System.out.println(year + " không là năm nhuận");
            }
        } else {
            System.out.println("Ngày tháng năm không hợp lệ!");
        }
        scanner.close();
    }
    public static boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > daysInMonth(month, year)) {
            return false;
        }
        return true;
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    public static int daysInMonth(int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}