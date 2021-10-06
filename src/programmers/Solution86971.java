package programmers;

import java.util.LinkedList;
import java.util.Queue;

/* 전력망을 둘로 나누기
n	wires	result
9	[[1,3],[2,3],[3,4],[4,5],[4,6],[4,7],[7,8],[7,9]]	3
4	[[1,2],[2,3],[3,4]]	0
7	[[1,2],[2,7],[3,7],[3,4],[4,5],[6,7]]	1
 */
public class Solution86971 {
    private static boolean[][] graph;
    private static boolean[] isVisited;
    private static int answer = Integer.MAX_VALUE;
    private static int N;

    private static void dfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        isVisited[1] = true;

        int sum = 1;
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                int index = queue.poll();
                for (int j = 1; j <= N; j++) {
                    if (graph[index][j] && !isVisited[j]) {
                        sum++;
                        queue.add(j);
                        isVisited[j] = true;
                    }
                }
            }
        }
        int a = N - sum;
        int b = N - a;
        answer = Math.min(answer, Math.abs(a - b));
    }

    public static int solution(int n, int[][] wires) {
        final int LENGTH = wires.length;
        N = n;
        answer = Integer.MAX_VALUE;
        for (int i = 0; i < LENGTH; i++) {
            graph = new boolean[n + 1][n + 1];
            isVisited = new boolean[n + 1];
            for (int j = 0; j < LENGTH; j++) {
                if (j != i) {
                    int[] wire = wires[j];
                    graph[wire[1]][wire[0]] = true;
                    graph[wire[0]][wire[1]] = true;
                }
            }
            dfs();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(9, new int[][] {
                {1,3},
                {2,3},
                {3,4},
                {4,5},
                {4,6},
                {4,7},
                {7,8},
                {7,9}
        }));
        System.out.println(solution(4, new int[][] {
                {1,2},
                {2,3},
                {3,4}
        }));
        System.out.println(solution(7, new int[][] {
                {1,2},
                {2,7},
                {3,7},
                {3,4},
                {4,5},
                {6,7}
        }));
    }
}
