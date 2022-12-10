package main;


class Main {
    public static void main(String[] args) {
        System.out.print(new Main().solution("(())()"));
    }
    boolean solution(String s) {
        if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') return false;

        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '(') count++;
            if(c == ')') count--;
            if(count < 0) break;
        }
        return count == 0;
    }
}


