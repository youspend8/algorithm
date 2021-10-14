package backjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 보물
 * @see <a href="https://www.acmicpc.net/problem/1026"></a>
 */
public class Main1026 {
    private static int N;
    private static int[] A;
    private static int[] B;

    static {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = new int[N];
        B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer += A[i] * B[N - i - 1];
        }
        System.out.println(answer);
    }
}
