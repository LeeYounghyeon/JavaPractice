package com.company.calendar;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int a = 7, b = 28;
        System.out.println(main.solution(a,b));
    }

    public String solution(int a, int b) {
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int date = 0;

        for(int i=0; i<a-1; i++){
            date += month[i];
        }
        date = date + b;

        return day[date%7];
    }
}
