package chap1_2.algorithm;

import java.util.Scanner;

/**
 * 알고리즘: 모든 쌍(i < j)에 대해 (A[i] + A[j])의 총합 S 계산
 *
 * 핵심 아이디어:
 * - i < j는 "값 비교"가 아니라 "인덱스 비교"이다
 * - 모든 쌍을 이중 for문으로 직접 더하면 O(N^2)로 시간 초과
 * - 한 번의 순회(O(N))로 각 원소가 만들어내는 "기여"를 누적한다
 *
 * 관찰:
 * - 현재 원소 A[j]가 이전 원소들과 만드는 쌍의 합
 *   = (이전 원소들의 합 pre) + A[j] * (이전 원소 개수 j)
 *
 * 변수 의미:
 * - pre: 현재 인덱스 이전까지의 원소 합(prefix sum)
 * - ans: 지금까지 계산된 모든 쌍의 합
 *
 * 시간복잡도: O(N)
 * 공간복잡도: O(N) (배열 저장 시), 스트리밍 입력이면 O(1)도 가능
 *
 * 타입 주의:
 * - 누적합 및 정답은 long 사용
 * - A[j] * j는 곱셈 시작을 long으로 캐스팅해 오버플로우 방지
 */
public class Algorithm01 {
    public static void main(String[] args) {

        // 이전 쌍의 합
        long pre = 0L;

        // 모든 쌍의 합
        long anx = 0L;

        Scanner sc = new Scanner(System.in);

        System.out.println("배열의 길이를 입력하세요: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("숫자를 입력하세요: ");
            arr[i] = sc.nextInt();
        }

        for(int j = 0; j < arr.length; j++) {
            anx += pre + arr[j] * j;
            pre += arr[j];
        }

        System.out.println("anx = " + anx);
    }
}
