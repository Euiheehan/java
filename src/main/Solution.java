package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
          System.out.print(new Main().solution("olleh","hello"));
    }

    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        return new String(beforeArr).equalsIgnoreCase(new String(afterArr))? 1: 0;
    }
}
