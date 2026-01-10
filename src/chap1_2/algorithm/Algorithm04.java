package chap1_2.algorithm;

/**
 * 알고리즘: 문자열 토큰 정수 파싱 + 범위 판정
 *
 * 문제 요약:
 * - 공백으로 구분된 정수 토큰들이 주어진다 (+/- 가능)
 * - int 범위에 들어가는 토큰만 합산한 값 T를 구한다 (T는 long으로 누적)
 * - long 범위에는 들어가지만 int 범위를 벗어나는 토큰 개수 C를 센다
 * - long 범위를 벗어나는 토큰은 무시한다
 *
 * 처리 규칙(우선순위):
 * 1) long 범위 밖 -> 무시
 * 2) long 범위 안 & int 범위 안 -> T += 값
 * 3) long 범위 안 & int 범위 밖 -> C++
 *
 * 변수 의미:
 * - T: int 범위 토큰들의 합 (long)
 * - C: long 가능하지만 int 불가인 토큰 개수 (int)
 *
 * 구현 방식 2가지:
 * A) 예외 기반:
 * - Long.parseLong(token)을 시도
 * - NumberFormatException이면 long 범위 밖(또는 정수 아님)으로 보고 무시
 *
 * B) 예외 없는 파싱(성능/학습 포인트):
 * - 토큰을 char 단위로 직접 읽으며 부호/숫자 검증
 * - value = value*10 + digit 하기 전에 overflow를 사전 감지
 * - overflow가 감지되면 해당 토큰을 long 범위 밖으로 판정하고 중단
 *
 * 시간복잡도:
 * - A: O(전체 문자열 길이) + 예외 비용(입력에 따라 변동)
 * - B: O(전체 문자열 길이)
 */
public class Algorithm04 {
    public static void main(String[] args) {
        long t = 0L;
        int c = 0;
        String str = "hello goodbye 2025120512061207 10 30000000000 -3333";
        String[] sArr = str.split("\\s+");

        for(int i = 0; i < sArr.length; i++) {
            // v가 long 범위 안이라는 전제 하에 int 범위를 판정
            // - int 범위면 합산(T)
            // - int 범위 밖이면 개수(C) 증가
            try {
                Long v = Long.parseLong(sArr[i]);
                if(v >= Integer.MIN_VALUE && v <= Integer.MAX_VALUE) {
                    t += v;
                } else {
                    c++;
                }

            } catch (NumberFormatException e) {

            }
        }

        System.out.println("c = " + c);
        System.out.println("t = " + t);
    }
}
