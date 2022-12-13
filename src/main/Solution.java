package main;

import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution("100001", "1010101"));
    }
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1,2)+Integer.parseInt(bin2,2));
    }
}

