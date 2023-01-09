package main;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Main().solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] arr = new int[]{6,6,5,4,3,2,1};

        int removeNumbers = 0;
        int matchNumbers = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : lottos){
            if(i == 0) removeNumbers++;
            else map.put(i, 1);
        }

        for(int num : win_nums){
            if(map.get(num) != null) matchNumbers++;
        }

        return new int[]{arr[matchNumbers+removeNumbers], arr[matchNumbers]};
    }
}