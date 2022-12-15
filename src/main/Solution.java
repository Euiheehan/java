package main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new String[]{"ayaye", "uuuma", "ye", "wyeoo", "ayaa"}));
    }

    public int solution(String[] babbling) {
        int answer = 0;

        for(int i =0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("woo", "1");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("ma", "1");
            //1로 해주는 이유는 순차 replace이기 때문에 ""이걸로 하는 경우에는 wyeoo -> woo -> "" 로 잘못된 count가 올라갈 수 있기 때문에.
            babbling[i] = babbling[i].replace("1", "");
            if(babbling[i].isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}

