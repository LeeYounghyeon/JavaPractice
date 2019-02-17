package com.company.dog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.run();
    }

    private void run(){
        Scanner scan = new Scanner(System.in);

        System.out.println("어떤 강아지 소개를 들으실건가요?>>");
        String dogName = scan.nextLine();

        Dog dog = getDog(dogName);
        dog.introduces();

    }

    private Dog getDog(String dogName){

        Dog dog;

        if(dogName.equals("푸들")){
            dog = new Poodle();
        }else if(dogName.equals("비숑")){
            dog = new Bison();
        }else if(dogName.equals("진도")){
            dog = new Jindo();
        }else if(dogName.equals("시바")){
            dog = new Siba();
        }else{
            dog = new Sichu();
        }

        return dog;
    }
}
