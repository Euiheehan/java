package main;


import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) {
        Main main =  new Main();

        System.out.println(main.BFS(5, 14));

    }
    public int BFS(int root, int goal) {

        boolean[] ch = new boolean[10001]; //방문한 숫자 다시 담지 않으려고 체크용
        int[] dis = {1,-1,5};

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(root);
        ch[root] = true;

        int L = 0;
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0; i<len; i++){
                Integer cur = queue.poll();
                if(cur == null) { throw new NullPointerException();}
                if(cur == goal) return L;
                for(int a : dis){
                    int sum = cur+a;
                    if(sum>=1 && sum<=10000 && !ch[sum]){
                        //제약조건 + 체크배열에 아직 안담긴 것이라면(중복 막기위해)
                        ch[sum] = true;
                        queue.offer(sum);
                    }
                }
            }
            L++;
        }
        return L;
    }
}


