package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What year were you born:");
        int year = input.nextInt();
        System.out.print("What month were you born in:");
        int month = input.nextInt();
        System.out.print("What day were you born in:");
        int dayOfMonth = input.nextInt();

        if(month == 1){
            months = "There are 31 days in January";
        }
        if(month == 2){
            months = "There are 28 days in February";
        }
        if(month == 3){
            months = "There are 31 days in March";
        }
        if(month == 4){
            months = "There are 30 days in April";
        }
        if(month == 5){
            months = "There are 31 days in May";
        }
        if(month == 6){
            months = "There are 30 days in June";
        }
        if(month == 7){
            months = "There are 31 days in July";
        }
        if(month == 8){
            months = "There are 31 days in August";
        }
        if(month == 9){
            months = "There are 30 days in September";
        }
        if(month == 10){
            months = "There are 31 days in October";
        }
        if(month == 11){
            months = "There are 30 days in November";
        }
        if(month == 12){
            months = "There are 31 days in December";
        }

        if (month >= 3) {
            month -= 2;
        } else {
            month += 10;
        }

        if ((month == 11) || (month == 12))
            year--;

        int nCentury = (year / 100);
        int nYear100 = year % 100;

        int h = 0;
        h += (dayOfMonth);
        h += ((13 / 5) * month - 0.2);
        h += (nYear100);
        h += (nYear100/4);
        h += (nCentury / 4);
        h -= (2 * nCentury);
        h %= 7;

        if (year >= 1700 && year <= 1751) {
            h -= 3;
        } else {
            if (year <= 1699) h -= 4;
        }
        f (h < 0) h += 7;

        System.out.print("Monday's child is fair of face,\n" +
                "Tuesday's child is full of grace,\n" +
                "Wednesday's child is full of woe,\n" +
                "Thursday's child has far to go.\n" +
                "Friday's child is loving and giving,\n" +
                "Saturday's child works hard for a living,\n" +
                "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.\n\n");


    }


}