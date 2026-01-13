package dataType.algorithm;

import java.util.Scanner;

/**
 * 알고리즘: prefix 평균들의 총합 계산
 *
 * 문제 요약:
 * - 길이 N의 수열 A가 주어질 때
 * - i = 1..N에 대해
 *   Bi = (A1 + A2 + ... + Ai) / i  (실수 평균)
 * - 모든 Bi의 합을 소수점 아래 10자리까지 출력
 *
 * 핵심 아이디어:
 * - 매 단계마다 "지금까지의 누적합"으로 평균을 계산한다
 * - 평균을 배열에 저장하지 않고 바로 누적하여 메모리를 절약한다
 *
 * 변수 의미:
 * - sum: 현재까지의 누적합 (long 사용, 오버플로우 방지)
 * - d: 모든 prefix 평균들의 합 (double)
 *
 * 주의 사항:
 * - sum / i 를 그대로 쓰면 정수 나눗셈이 되므로
 *   반드시 (double)sum / i 형태로 계산해야 한다
 * - 반복문 인덱스는 0부터 시작하므로
 *   평균 계산 시 분모는 (j + 1)을 사용한다
 *
 * 시간복잡도: O(N)
 * 공간복잡도: O(1) (입력 배열 제외)
 */

public class Algorithm02 {
    public static void main(String[] args) {

        // 평균들의 합
        double d = 0;

        // 이전 원소들의 합
        long sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("배열의 길이를 입력하세요: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("숫자를 입력해주세요: ");
            arr[i] = sc.nextInt();
        }

        // 평균들의 합 구하기
        for(int j = 0; j < arr.length; j++) {
            sum += arr[j];
            d += (double) sum / (j + 1);
        }

        System.out.printf("평균들의 합 = %.10f\n", d);
    }
}
