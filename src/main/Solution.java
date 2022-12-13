package main;

import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution("100001", "1010101"));
    }
    public String solution(String bin1, String bin2) {
        StringBuilder answer = new StringBuilder();
        int len;
        if(bin1.length() < bin2.length()){
            len = bin2.length();
            bin1 = "0".repeat(bin2.length()-bin1.length())+bin1;
        }else if(bin1.length() > bin2.length()){
            len = bin1.length();
            bin2 = "0".repeat(bin1.length()-bin2.length())+bin2;
        }else {
            len = bin1.length();
        }

        int addSum = 0;
        for(int i = len-1; i >= 0; i--){
            int sum = Character.getNumericValue(bin1.charAt(i)) + Character.getNumericValue(bin2.charAt(i)); // 더한 값
            int total10Sum = sum+addSum;

            if(total10Sum == 3){
                answer.append("1");
            } else if (total10Sum == 2) {
                answer.append("0");
            }else{
                answer.append(total10Sum);
            }

            addSum = total10Sum > 1? 1 : 0;
        }

        if(addSum == 1){
            answer.append("1");
        }
        return answer.reverse().toString();
    }
}

