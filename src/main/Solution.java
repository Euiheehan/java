package main;

public class Solution {


    public static void main(String[]args){
        System.out.println(new Solution().solution("qwer"));
    }

    public String solution(String s) {

        int beginNum = s.length()/2;
        boolean isTwoNum = s.length() % 2 == 0;

        return isTwoNum ? s.substring(beginNum-1, beginNum+1) : s.substring(beginNum, beginNum+1);
    }
}


