/* C035: 시험 합격 판정
종합 력을 중시 하는 paiza 대학 입 시는 1 차 시험 (영어, 수학, 과학, 국어, 지리 역사 5 과목에서 각각 100 점 만점)의 성적으로 2 단계 골라 합니다. 2 단계 골라를 통과 하는 조건은 다음과 같이 되어 있습니다.

전체 과목의 합계 득점이 350 점 이상
이과 수험생의 경우 과학 2 과목 (수학, 과학)의 합계 득점이 160 점 이상
인문 계 수험생의 경우 인문 계 2 과목 (국어, 지리 역사)의 합계 득점이 160 점 이상
수험생 각 과목 점수가 입력 되기 때문에, 얼마나 2 단계 골라를 통과할 수 있는지 요청 하십시오.

보기)
수험생 2 전체 과목의 합계는 350 점 이상 이지만 문과 2 과목 총 160 점 미만 이므로 자격 박탈. 반면 수험생 4 과학 2 과목 총 160 점 이상 이지만 전체 과목 총 350 점 미만 이기 때문에 실패 합니다.

→ 통과 인원: 2 명

이것은 예제 1에 대응 하 고 있습니다.
 */

package C;

import java.util.*;

public class C035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int pass = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            int sum1 = 0;
            String s = scanner.next();
            for (int j = 0; j < 5; j++) {
                int a = scanner.nextInt();
                sum += a;
                if (s.equals("s")) {
                    if (j == 1 || j == 2) {
                        sum1 += a;
                    }
                } else {
                    if (j == 3 || j == 4) {
                        sum1 += a;
                    }
                }
            }
            if (sum >= 350 && sum1 >= 160) {
                pass++;
            }
        }
        System.out.println(pass);
    }
}