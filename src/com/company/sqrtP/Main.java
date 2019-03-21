package com.company.sqrtP;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        long num = 121;
        System.out.println(main.solution(num));
    }

    public long solution(long n) {
        long x = (long)Math.sqrt(n);

        if((long)Math.pow(x,2) == n){
            return (long)Math.pow(x+1,2);
        }else {
            return -1;
        }
    }

}
