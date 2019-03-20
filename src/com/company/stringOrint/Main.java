package com.company.stringOrint;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        String str = "1233";
        System.out.println(main.solution(str));

    }

    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false;

        boolean result = true;

        for(char n : s.toCharArray()) {
            if (!(n >= 48 && n <= 57)) {
                result = false;
            }
        }

        return result;
    }

}