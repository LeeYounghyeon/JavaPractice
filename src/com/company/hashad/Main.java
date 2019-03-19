package com.company.hashad;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int x = 11;
        System.out.println(main.solution(x));
    }

    public boolean solution(int x) {
        String num = String.valueOf(x);
        String a[] = num.split("");
        int sum = 0;

        for(String s : a)
            sum = sum + Integer.parseInt(s);

        return x%sum == 0;
    }
}
