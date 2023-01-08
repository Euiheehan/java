package main;


import java.util.Stack;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution("1D2S#10S"));
    }

    public int solution(String dartResult) {

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 0; i<dartResult.length(); i++){
            if(Character.isDigit(dartResult.charAt(i))){
                int now;
                if(dartResult.charAt(i) == '1' && Character.isDigit(dartResult.charAt(i+1))){
                    now = 10;
                    //10일 경우는 다음 인덱스 skip
                    i++;
                }else{
                    now = Character.getNumericValue(dartResult.charAt(i));
                }
                stack.push(now);
            }else{
                int number = stack.pop();
                switch (dartResult.charAt(i)) {
                    case 'T' -> stack.push((int) Math.pow(number, 3));
                    case 'D' -> stack.push((int) Math.pow(number, 2));
                    //stack에 쌓으려면 1제곱도 필요함
                    case 'S' -> stack.push((int) Math.pow(number, 1));
                    case '*' -> {
                        stack.push(stack.pop()*2);
                        stack.push(number*2);
                    }
                    case '#' -> stack.push(number*-1);
                }
            }
        }
        int answer = 0;
        while(!stack.isEmpty()){
            answer+=stack.pop();
        }
        return answer;
    }
}