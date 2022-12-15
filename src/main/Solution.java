package main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new String[]{"ayaye", "uuuma", "ye", "wyeoo", "ayaa"}));
    }

    public int solution(String[] babbling) {
        return (int) Arrays.stream(babbling)
                .map(s -> s.replaceAll("(aya|ye|woo|ma)",""))
                .filter(s -> s.length() ==0)
                .count();
    }
}

