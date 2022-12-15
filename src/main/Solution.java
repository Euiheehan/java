package main;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new String[]{"ayaye", "uuuma", "ye", "wyeoo", "ayaa"}));
    }

    public int solution(String[] babbling) {
        int answer = 0;
        for (String s : babbling) {
            //if (s.matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")) {
            //이것을 좀 더 쉽게한 것이 아래꺼
            if (s.matches("(aya|ye|woo|ma)+")) {
                answer++;
            }
        }
        return answer;
    }
}

