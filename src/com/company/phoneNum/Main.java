package com.company.phoneNum;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String phoneNum = "027778888";
        System.out.println(main.solution(phoneNum));
    }

    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int size = phone_number.length();
        String str = "";

        for(int i=0; i<size-4; i++){
            sb.append("*");
        }
        sb.append(str);
        sb.append(phone_number.substring(size-4));

        return sb.toString();
    }


}
