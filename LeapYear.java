package com.company;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year > 0 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}