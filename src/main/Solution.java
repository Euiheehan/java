package main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new String[]{"ayaye", "uuuma", "ye", "wyeoo", "ayaa"}));
    }

    public int solution(String[] babbling) {
        int answer = 0;

        for(int i =0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya|woo|ye|ma", "");
            if(babbling[i].isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}

