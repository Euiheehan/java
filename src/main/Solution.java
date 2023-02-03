package main;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(" 3  aREWF  Dffdd   fdfddr "));
    }

    public String solution(String s) {
        s = s.toLowerCase();
        String[] arr = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for(String a : arr){
            //공백문자가 연속해서 나올 수 있습니다.
            if(!a.isEmpty()){
                builder.append(a.substring(0,1).toUpperCase()).append(a.substring(1));
            }
            builder.append(" ");
        }
        return s.endsWith(" ")?builder.toString() : builder.toString().trim();
    }
}