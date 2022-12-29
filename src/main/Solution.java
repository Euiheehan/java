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
        Set<Integer> set = new TreeSet<>();
        //TreeSet 은 중복제거 + 자동 오름차순 정렬
        //Set<Integer> set = new HashSet<>();

        //어차피 아래에서 정렬하니까
        //Arrays.sort(numbers);

        for(int i=0; i< numbers.length; i++){
            for(int j =i+1; j< numbers.length; j++){
                int sum = numbers[i]+numbers[j];
                set.add(sum);
                }
            }
        return set.stream().mapToInt(Integer::intValue).toArray();
        //HashSet쓰면 sorted()해줘야 함 정렬X
        //return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }




}