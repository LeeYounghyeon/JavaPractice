package com.company.addNum;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int num = 122;
        System.out.println(main.solution(num));
    }

    public int solution(int n) {
        int answer = 0;
        String[] a =  String.valueOf(n).split("");

        for(String str: a)
            answer += Integer.parseInt(str);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

}
