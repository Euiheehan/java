package main;

import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s = in.nextLine();

        System.out.print(new Main().solution(s));
    }

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        int sum = 0;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) =='(') stack.push('(');
            else {
                stack.pop();
                //레이저용 닫는 괄호면
                if(s.charAt(i-1) == '(') sum += stack.size();
                    //선분용 닫는 괄호면
                else sum++;
            }
        }
        return sum;
    }
}