package main;

import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(5,3));
    }

    public BigInteger solution(int balls, int share) {

        //공식은 balls! / (balls-share)! * share!

        BigInteger de = BigInteger.ONE;
        BigInteger nu = BigInteger.ONE;

        //ex)분모는 5! 이 아니라 5*4만 돌면 분자에서 3!안해줘도 되기 때문에.
        for(int i = balls; i>share; i--){
            de = de.multiply(BigInteger.valueOf(i));
        }

        for(int i = 1; i<=(balls-share); i++){
            nu  = nu.multiply(BigInteger.valueOf(i));
        }
        return de.divide(nu);
    }
}

