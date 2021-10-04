package backjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2667 {
    private static int N;
    private static int[][] graph;
    private static List<Integer> answer;
    private static int count = 1;
    private static boolean[][] isVisited;

    static {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            for (int j = 0; j < N; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
    }

    public static void main(String[] args) {
        isVisited = new boolean[N][N];
        answer = new ArrayList<>();
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                if (!isVisited[y][x] && graph[y][x] == 1) {
                    count = 1;
                    dfs(y, x);
                    answer.add(count);
                }
            }
        }
        System.out.println(answer.size());
        answer.stream()
                .sorted()
                .forEach(System.out::println);
    }

    private static boolean isOutOfRangeX(int x) {
        return x < 0 || x >= N;
    }

    private static boolean isOutOfRangeY(int y) {
        return y < 0 || y >= N;
    }

    private static void dfs(int y, int x) {
        isVisited[y][x] = true;
        if (!isOutOfRangeY(y + 1) && !isVisited[y + 1][x] && graph[y + 1][x] == 1) {
            count++;
            dfs(y + 1, x);
        }
        if (!isOutOfRangeX(x + 1) && !isVisited[y][x + 1] && graph[y][x + 1] == 1) {
            count++;
            dfs(y, x + 1);
        }
        if (!isOutOfRangeY(y - 1) && !isVisited[y - 1][x] && graph[y - 1][x] == 1) {
            count++;
            dfs(y - 1, x);
        }
        if (!isOutOfRangeX(x - 1) && !isVisited[y][x - 1] && graph[y][x - 1] == 1) {
            count++;
            dfs(y, x - 1);
        }
    }
}
