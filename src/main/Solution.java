package main;

public class Solution {


    public static void main(String[]args){
        System.out.println(new Solution().solution(3, 20, 4));
    }

    public long solution(int price, int money, int count) {
        long answer = 0;

        for(int i = 1; i<=count ; i++){
            answer += price * i;
        }
        return money - answer < 0? (money - answer)*-1 : 0;

        //등차수열
        //return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}


