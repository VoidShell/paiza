/* C028: 단어 시험 평가
단어 시험 평가는 어디까지를 맞춤법이 틀린 것으로 보아 어디까지를 다른 단어로 간주가 말썽만 합니다.
그래서 paiza 예비 학교에서는 다음과 같은 평가 기준을 도입 하 고 이것에 따라 엄격 하 게 평가 하 고 있습니다.

ㆍ 정답 단어와 정확히 일치 하는 → ◯ 2 점
/정답 단어 길이 (문자 수)가 다 → × 0 점
/정답 단어와 길이는 같지만 한 글자만 다른 → △ 1 점
/정답 단어와 길이는 같지만 문자 두 개 이상의 다른 → × 0 점이

여기에서 「 다른 」와 같은 위치에 있는 문자가 다르다 라는 것을 의미 합니다.

예)
정답: apple, 답: aple → 0 점 (길이가 다르게)
정답: orange, 답: olange → 1 점 (길이는 같지만 한 글자만 다름)
정답: grape, 답: glepe → 0 점 (길이는 같지만 두 캐릭터 다)
정답: lemon, 답: lemon → 2 점 (정확히 일치)

합계 점수 → 3 점

문제 수와 각 문제의 정답 단어 및 학생 들의 답안지가 주어 지기 때문에 이러한 형태로 paiza 예비 평가 기준에 따라이 눈동자의 총 점수를 계산 합니다.
 */

package C;

import java.util.Scanner;

public class C028 {
    public static int diffCharCount(String q, String a) {
        int count = 0;

        for (int i = 0; i < q.length(); i++) {
            if (q.substring(i, i + 1).equals(a.substring(i, i + 1)) ) {
                count = count + 1;
            }
        }
        return (q.length() - count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String q = scanner.next();
            String a = scanner.next();

            if (q.length() == a.length()) {
                if (a.equals(q)) {
                    score = score + 2;
                } else if (diffCharCount(q, a) == 1) {
                    score = score + 1;
                }
            }
        }
        System.out.println(score);
    }
}
