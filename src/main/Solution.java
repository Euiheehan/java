package main;

import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}}));
    }

    public int solution(int[][] maps) {
        int[] dx ={1,-1,0,0};
        int[] dy ={0,0,1,-1};

        int nRealSize = maps.length-1;
        int mRealSize = maps[nRealSize].length-1;

        Queue<Coordinate> queue = new LinkedList<>();
        //시작 지점 넣기
        queue.offer(new Coordinate(0,0));
        maps[0][0] = 0;

        int count = 0;
        while(!queue.isEmpty()){
            int len = queue.size();
            //같은 depth는 다돌고 나와야하므로
            for(int i = 0 ; i<len; i++){
                //현재 위치
                Coordinate c = queue.poll();
                if(c == null) throw new NullPointerException();
                //현재위치가 끝지점이면 +1해서 return
                if(c.x == nRealSize && c.y == mRealSize) return count+1;

                //거리 돌기 (동서남북)
                for(int dis = 0; dis<4; dis++){
                    //움직인 장소가 배열 범위 안이면서 갈 수 있는 길이면,
                    int x = c.x+dx[dis];
                    int y = c.y+dy[dis];
                    if( (x >= 0 && x <= nRealSize)
                            && (y >= 0 && y <= mRealSize)
                            && maps[x][y] == 1){

                        //방문 체크
                        maps[x][y] = 0;
                        queue.offer(new Coordinate(x,y));
                    }
                }
            }
            count++;
        }
        return -1;
    }
}

class Coordinate{
    int x;
    int y;
    Coordinate(int x, int y){
        this.x =x;
        this.y =y;
    }
}