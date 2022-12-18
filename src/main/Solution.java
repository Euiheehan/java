package main;


import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main().solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }

    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(arr[0]);

        List<Integer> list = new ArrayList<>();
        for(int i : arr){
           if(i != queue.element()){
               queue.offer(i);
               list.add(queue.poll());
           }
        }
        list.add(queue.poll());
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

