package backjoon;

import java.util.Scanner;

import static util.Debug.print;

public class Main11052 {
    private static int N;
    private static int[] array;
    private static int[] dp;

    static {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        dp = new int[N];
        array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        dp[0] = N * array[0];
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                dp[i] = array[i] * (N / i);
            } else {
                dp[i] = array[i] * (N / i) + array[N % i];
            }
        }
        print(dp);
    }
}
