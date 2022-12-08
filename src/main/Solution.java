package main;

import java.util.*;

class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(new Main().solution(new int[]{3,3,4,5,5,2,2,2,1,5,6,6,5,4,3,4,34,234,23,423,4,3,3,3,4,3,6,7,8,8,5,45,4,4,4,6,7,7,7,9,3,2,2,4,3,3,4,5,5,2,2,2,1,5,6,6,5,4,3,4,34,234,23,423,4,3,3,3,4,3,6,7,8,8,5,45,4,4,4,6,7,7,7,9,3,2,2,4,3,3,4,5,5,2,2,2,1,5,6,6,5,4,3,4,34,234,23,423,4,3,3,3,4,3,6,7,8,8,5,45,4,4,4,6,7,7,7,9,3,2,2,4,3,3,4,5,5,2,2,2,1,5,6,6,5,4,3,4,34,234,23,423,4,3,3,3,4,3,6,7,8,8,5,45,4,4,4,6,7,7,7,9,3,2,2,4}));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public int solution(int[] nums) {
        int pickUpCount = nums.length/2;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        //distinct보다 HashSet이 빠른이유는 distinct는 statful하기 때문
        //int kindCount = (int)Arrays.stream(nums).distinct().count();

        //return Math.min(pickUpCount, kindCount);
        return Math.min(pickUpCount, set.size());
    }
}
