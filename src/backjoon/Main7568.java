package backjoon;

import java.util.Arrays;
import java.util.Scanner;

/*
5
55 185
58 183
88 186
60 175
46 155
 */
public class Main7568 {
    private static int N;
    private static int[][] persons;
    private static int[] answer;

    static {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        persons = new int[N][2];
        answer = new int[N];
        Arrays.fill(answer, 1);
        for (int i = 0; i < N; i++) {
            int[] arr = new int[2];
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();
            persons[i] = arr;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            int weight = persons[i][0];
            int height = persons[i][1];
            for (int j = 0; j < N; j++) {
                int weightTo = persons[j][0];
                int heightTo = persons[j][1];
                if (i != j) {
                    if (weight < weightTo && height < heightTo) {
                        answer[i]++;
                    }
                }
            }
        }
        Arrays.stream(answer).forEach(System.out::println);
    }
}
