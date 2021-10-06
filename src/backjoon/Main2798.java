package backjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 블랙잭
10 500
93 181 245 214 315 36 185 138 216 295

5 21
5 6 7 8 9
 */
public class Main2798 {
    private static int N;
    private static int M;
    private static int answer;
    private static int[] numbers;

    static {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        answer = 0;
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        backtracking(0, 0, new ArrayList<>(), new boolean[N]);
        System.out.println(answer);
    }

    private static void backtracking(int index, int sum, List<Integer> nums, boolean[] isVisited) {
        if (index >= N) {
            return;
        }
        if (nums.size() == 3) {
            if (sum <= M) {
                answer = Math.max(answer, sum);
            }
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!isVisited[i]) {
                nums.add(numbers[i]);
                isVisited[i] = true;
                backtracking(index + 1, sum + numbers[i], nums, isVisited);
                nums.remove(nums.size() - 1);
                isVisited[i] = false;
            }
        }
    }
}
