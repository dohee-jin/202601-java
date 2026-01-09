package chap1_2.algorithm;

import java.util.Scanner;

/**
 * 알고리즘: 최소 길이 부분배열 (부분합 >= K)
 *
 * 조건:
 * - 모든 원소가 양수이므로 투 포인터(슬라이딩 윈도우) 가능
 *
 * 아이디어:
 * - right를 증가시키며 sum을 키운다
 * - sum >= K가 되면 조건을 만족했으므로
 *   left를 가능한 만큼 줄여서(while) 최소 길이를 갱신한다
 *
 * 변수:
 * - left: 현재 구간의 시작 인덱스
 * - right: 현재 구간의 끝 인덱스
 * - sum: 현재 구간 합 (long)
 * - best: 조건을 만족하는 최소 길이 (초기값 0)
 *
 * 시간복잡도: O(N) (left, right가 각각 최대 N번 이동)
 */

public class Algorithm03 {
    public static void main(String[] args) {

        long sum = 0;
        int right = 0;
        int left = 0;
        int best = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        // 배열 길이 입력
        System.out.println("배열의 길이를 입력하세요: ");
        int n = sc.nextInt();

        // 배열 입력
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("숫자를 입력해주세요: ");
            arr[i] = sc.nextInt();
        }

        // 목표값
        System.out.println("목표값을 입력해주세요: ");
        long k = sc.nextLong();

        for(right = 0; right < n; right++) {
            sum += arr[right];

            // sum >= k 일 경우 최소 배열을 만들기 위해 진행
            while(sum >= k) {
                best = Math.min(best, right - left + 1);
                sum -= arr[left++];
            }

        }

        System.out.println(best == Integer.MAX_VALUE ? 0 : best);
    }
}
