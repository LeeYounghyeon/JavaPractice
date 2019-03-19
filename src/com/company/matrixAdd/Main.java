package com.company.matrixAdd;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        System.out.println(main.solution(arr1,arr2));

    }


    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i=0; i < arr1.length; i++){
            for(int j=0; j < arr1[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    }
