package main;

class Main {
    public static void main(String[] args) {


          System.out.print(new Main().solution(".... . .-.. .-.. ---"));
    }

    public String solution(String letter) {

        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder answer = new StringBuilder();
        String[] letters = letter.split(" ");

        for(String s : letters){
            for(int i = 0; i<arr.length; i++){
                if(s.equalsIgnoreCase(arr[i])){
                    answer.append(Character.toChars(i+97));
                    break;
                }
            }
        }

        return answer.toString();
    }
}
