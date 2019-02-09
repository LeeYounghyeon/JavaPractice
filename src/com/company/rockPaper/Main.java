package com.company.rockPaper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.run();

    }

    private void run(){
        Scanner scan = new Scanner(System.in);

        System.out.println("******* 가위바위보 게임 *******");
        System.out.println("첫번재 사람은 무엇을 낼까요?");
        System.out.print("1. 가위 2. 바위 3. 보 >>");
        int first = scan.nextInt();
        System.out.println("두번째 사람은 무엇을 낼까요?");
        System.out.print("1. 가위 2. 바위 3. 보 >>");
        int second = scan.nextInt();

        whoIsWin(first, second);
    }

    private void whoIsWin(int first, int second){
        int value = Math.abs(first-second);

        if(value == 0){
            System.out.println("무승부 입니다.");
        }else if(value == 1){
            System.out.println(getBigger(first, second) + "가 이겼습니다.");
        }else {
            System.out.println(getSmaller(first, second) + "가 이겼습니다.");
        }
    }

    private String getBigger(int first, int second) {
        if (first > second)
            return "첫번째";
        else
            return "두번째";
    }

    private String getSmaller(int first, int second) {
        if (first > second)
            return "두번째";
        else
            return "첫번째";
    }

}
