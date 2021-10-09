package programmers.skillcheck.level2;

import java.util.Arrays;

/*
A	B	answer
[1, 4, 2]	[5, 4, 4]	29
[1,2]	[3,4]	10
 */
public class Solution1 {
    public static int solution(int[] A, int[] B) {
        int answer = 0;
        int length = A.length;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < length; i++) {
            answer += A[i] * B[length - 1 - i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(
                new int[] {1,4,2},
                new int[] {5,4,4}
        ));
        System.out.println(solution(
                new int[] {1,2},
                new int[] {3,4}
        ));
    }
}
