package main;


import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main().solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }

    public int[] solution(int []arr) {

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i : arr){
           if(list.get(list.size()-1) != i){
               list.add(i);
           }
        }
        int[] result = new int[list.size()];
        for(int i = 0; i< result.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}

