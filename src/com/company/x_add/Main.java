package com.company.x_add;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int x = 6;
        int n = 5;
        System.out.println(main.solution(x,n));
    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int num = 0;

            for(int i=1; i<=n; i++){
                answer[num++] = (long)x*i;
            }

        return answer;
    }
}
