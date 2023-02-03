package main;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(" 3  aREWF  Dffdd   fdfddr "));
    }

    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        boolean isStartWith = true;

        for(char c : s.toCharArray()){
            sb.append(isStartWith? Character.toUpperCase(c) : c);
            isStartWith = c == ' ';
        }

        return sb.toString();
    }
}