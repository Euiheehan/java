package main;

import java.util.Stack;

class Main {
    public static void main(String[] args) {

        System.out.println(new Main().solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4}));
    }

    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();

        int count = 0;
        for(int m : moves){
            int realM = m-1;
            for(int i =0; i<board.length; i++){
                if(board[i][realM] != 0){
                    if(stack.size( ) > 0 && stack.peek() == board[i][realM]){
                        count+=2;
                        stack.pop();
                    }else{
                        stack.push(board[i][realM]);
                    }
                    board[i][realM] = 0;
                    break; // 그 아래꺼까지 가져오기 때문에 break 해줘야함
                }
            }
        }

        return count;
    }
}