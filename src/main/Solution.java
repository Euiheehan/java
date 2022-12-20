package main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main().solution(new String[]{"sun", "bed", "car"}, 1)));
    }

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
            else return s1.charAt(n)-s2.charAt(n);
        });
        return strings;
    }
}

