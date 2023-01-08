package main;


class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution("1S*2T*3S"));
    }

    public int solution(String dartResult) {

        int[] arr = new int[3];
        int index = -1;
        for(int i = 0; i<dartResult.length(); i++){
            //숫자일 경우 인덱스 change
            if(Character.isDigit(dartResult.charAt(i))){
                index++;
                if(dartResult.charAt(i) == '1' && Character.isDigit(dartResult.charAt(i+1))){
                    arr[index] = 10;
                    //10일 경우는 다음 인덱스 skip
                    i++;
                }else{
                    arr[index] = Character.getNumericValue(dartResult.charAt(i));
                }
            }else{
                switch (dartResult.charAt(i)) {
                    case 'T' -> arr[index] = (int) Math.pow(arr[index], 3);
                    case 'D' -> arr[index] = (int) Math.pow(arr[index], 2);
                    case '*' -> {
                        arr[index] *= 2;
                        if(index != 0) arr[index - 1] *= 2;
                    }
                    case '#' -> arr[index] *= (-1);
                }
            }
        }
        int answer = 0;
        for(int i : arr){
            answer+=i;
        }
        return answer;
    }
}