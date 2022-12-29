package main;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(main.solution(arr)));
    }

    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(numbers);

        for(int i=0; i< numbers.length; i++){
            for(int j =i+1; j< numbers.length; j++){
                int sum = numbers[i]+numbers[j];
                if(!list.contains(sum)){
                    list.add(sum);
                }
            }
        }
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }




}