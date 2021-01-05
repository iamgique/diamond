package com.iamgique;

public class Solution {
    public static void main(String[] args) {
        int input = 9;
        oddDiamond(input);
    }

    public static void oddDiamond(int input){
        for(int i = 0; i < input; i++) {
            for(int j = 0; j < input; j++) {

                if(i <= input / 2) {
                    if(j == input / 2 - i || input - j == input / 2 - i + 1) {
                        System.out.print("X");
                    } else {
                        System.out.print("-");
                    }
                }
                if(i > input / 2) {
                    if(j == i - input / 2 || input - j == i + 1 - input / 2) {
                        System.out.print("X");
                    } else {
                        System.out.print("-");
                    }
                }
            }
            System.out.println();
        }
    }

}
