package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main().solution(new String[]{"sun", "bed", "car"}, 1)));
    }

    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted((o1, o2) -> {
                    if(o1.charAt(n) == o2.charAt(n)){
                        return o1.compareTo(o2);
                    }else{
                        return String.valueOf(o1.charAt(n)).compareTo(String.valueOf(o2.charAt(n)));
                    }
                })
                .toArray(String[]::new);
    }
}

