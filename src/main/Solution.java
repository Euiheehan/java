package main;

import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
    }

    public int solution(int[] ingredient) {

        Stack<Integer> stack1 = new Stack<>();
        List<Integer> list = new ArrayList<>();

        int count = 0;
        int answer = 0;
        int[] arr = new int[]{1,3,2,1};

        for(int i : ingredient){
            stack1.push(i);
            //햄버거를 만들 수 있는 최소 수량 이상, 현재 포인터가 1 == 빵 인 경우만 check
            if(stack1.size() > 3 && stack1.peek() == 1){
                for (int k : arr) {
                    int pop = stack1.pop();
                    //햄버거 순서가 아닐 경우를 대비해
                    list.add(pop);
                    //햄버거 순서가 아닐 경우 이전까지 뺀 stack 원소 순서대로 넣기
                    if (k != pop) {
                        Collections.reverse(list);
                        stack1.addAll(list);
                        break;
                    }
                    count++;
                }
                list.clear();
                if(count == 4) answer++;
                count = 0;
            }
        }
        return answer;
    }
}