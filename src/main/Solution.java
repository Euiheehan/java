package main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(

            new String[] {"i", "water", "drink"},
            new String[] {"want", "to"},
            new String[] {"i", "want", "to", "drink", "water"}
        ));
    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int cards1Num = 0;
        int cards2Num = 0;

        for(String s : goal) {
            int findCard1Index = Arrays.asList(cards1).indexOf(s) + 1;
            int findCard2Index = Arrays.asList(cards2).indexOf(s) + 1;

            if (findCard1Index != 0 && findCard1Index - cards1Num == 1) {
                cards1Num++;
            }else if(findCard2Index != 0 && findCard2Index - cards2Num == 1) {
                cards2Num++;
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}