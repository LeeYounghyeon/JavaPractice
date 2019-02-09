package com.company.rockPaper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("******* 가위바위보 게임 *******");
        System.out.println("첫번재 사람은 무엇을 낼까요?");
        System.out.print("1. 가위 2. 바위 3. 보 >>");
        int first = scan.nextInt();
        System.out.println("두번째 사람은 무엇을 낼까요?");
        System.out.print("1. 가위 2. 바위 3. 보 >>");
        int second = scan.nextInt();

        if(first == 1){
            if(second == 1){
                System.out.println("무승부 입니다.");
            }else if(second == 2){
                System.out.println("두번째 사람이 이겼습니다.");
            }else if(second == 3){
                System.out.println("첫번째 사람이 이겼습니다.");
            }
        }else if(first == 2){
            if(second == 1){
                System.out.println("첫번째 사람이 이겼습니다.");
            }else if(second == 2){
                System.out.println("무승부 입니다.");
            }else if(second == 3){
                System.out.println("두번째 사람이 이겼습니다.");
            }
        }else if(first == 3){
            if(second == 1){
                System.out.println("두번째 사람이 이겼습니다.");
            }else if(second == 2){
                System.out.println("첫번째 사람이 이겼습니다.");
            }else if(second == 3){
                System.out.println("무승부 입니다.");
            }
        }
    }

}
