package main;

import static java.lang.Long.bitCount;

class Main {

  public static void main(String[] args) {

    System.out.println(new Main().solution(78));
  }

    public int solution(int n) {
        int bitCount = bitCount(n);
        while (bitCount != bitCount(++n)) {}
        return n;
    }
}