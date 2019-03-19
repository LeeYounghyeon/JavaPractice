package com.company.greatLeast;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int a = 3, b = 12;
        System.out.println(main.solution(a,b).toString());
    }

    public int[] solution(int n, int m) {

        int max = n > m ? n : m;
        int min = n < m ? n : m;

        int greates=1;
        int least=1;

       while (min != 0){
           int k = max % min;
           max = min;
           min = k;
           greates = max;
       }

       least = n * m / greates;


        int[] answer = {greates,least};

        return answer;
    }
}
