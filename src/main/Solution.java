package main;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new int[][]{{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}}));
    }
    public int solution(int[][] board) {
        //위험지역 check x,y 좌표
        int [] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int [] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        int warningCount = 0;
        int len = board.length;

        for(int i = 0; i<len; i++){
            for(int j = 0; j<len; j++){
                if(board[i][j] == 1){
                    //실제 위험지역 ++
                   warningCount++;

                   for(int k = 0; k<dx.length; k++){
                       //배열 범위인지 check, 위험지역 체크한거 다시 체크하지 않기
                       if( (i+dx[k] >-1 && i+dx[k] < len)
                           && (j+dy[k] >-1 && j+dy[k] <len)
                           && board[i+dx[k]][j+dy[k]] == 0
                       ){
                           //파생 위험지역 (1로 넣어주면 실제 위험지역과 구분이 안되므로 다른숫자 넣어주기)
                           warningCount++;
                           board[i+dx[k]][j+dy[k]] = 2;

                       }
                   }
                }
            }
        }
        return len*len - warningCount;
    }
}

