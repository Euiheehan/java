package main;

import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Main main =  new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] ball = new int[n];
        int[] order = new int[n];

        for(int i =0; i<n; i++){
            ball[i] = scanner.nextInt();
        }

        for(int i =0; i<n; i++){
            order[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(main.solution(ball, order)));

    }

    public int[] solution(int[] ball, int[] order) {

        List<Integer> ballList = Arrays.stream(ball).boxed().collect(Collectors.toCollection(LinkedList::new));
        List<Integer> orderList = Arrays.stream(order).boxed().collect(Collectors.toCollection(ArrayList::new));
        List<Integer> tempList = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        int orderIndex = 0;
        while(!ballList.isEmpty()){

            if(!tempList.isEmpty()){
                int tempIndex = 0;
                while(tempIndex != tempList.size()){
                    if(ballList.get(0).equals(tempList.get(tempIndex))
                            || ballList.get(ballList.size()-1).equals(tempList.get(tempIndex))){
                        ballList.remove(ballList.get(0).equals(tempList.get(tempIndex))? 0 : ballList.size() - 1);
                        result.add(tempList.get(tempIndex));
                        tempList.remove(tempIndex);
                        tempIndex = 0;
                    }else{
                        tempIndex++;
                    }
                }
            }

            if(ballList.get(0).equals(orderList.get(orderIndex)) || ballList.get(ballList.size()-1).equals(orderList.get(orderIndex))){
                ballList.remove(ballList.get(0).equals(orderList.get(orderIndex))? 0 : ballList.size()-1);
                result.add(orderList.get(orderIndex));
            }else{
                tempList.add(orderList.get(orderIndex));
            }
            orderIndex++;
        }
       return result.stream().mapToInt(Integer::intValue).toArray();
    }
}