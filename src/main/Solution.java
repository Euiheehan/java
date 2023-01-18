package main;

class Main {
    public static void main(String[] args) {
      System.out.print(new Main().solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));

    }
    public int solution(String[] babbling) {
        int answer = 0;

        String[] arr = new String[]{"aya", "ye", "woo", "ma"};


        for(String s : babbling){
            for (int i = 0; i<arr.length; i++){
                if(s.contains(arr[i])){
                    s = s.replaceAll(arr[i], String.valueOf(i));
                }
            }

            boolean isTrue = true;
            if(s.chars().allMatch(Character::isDigit)) {
                for(int i = 0; i<s.length()-1; i++){
                    if(s.charAt(i)==s.charAt(i+1)){
                        isTrue = false;
                        break;
                    }
                }
                if(isTrue){
                    answer++;
                }
            }
        }
        return answer;
    }
}