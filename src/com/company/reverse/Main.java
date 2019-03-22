package com.company.reverse;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        long a = 12345;
        System.out.println(main.solution(a));
    }

    public int[] solution(long n) {
        String[] str = String.valueOf(n).split("");
        int[] num = new int[str.length];
        int count=str.length-1;

        for(String s : str)
            num[count--] = Integer.parseInt(s);

        return num;
    }
}
