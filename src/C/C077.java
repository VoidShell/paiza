/* C077: 【 30만 명 경의 문제 】 보고서 받음
당신은 파이 더 대학의 교수입니다. 학생에 게 부과 된 보고를 평가 하기 위해, 당신은 자동으로 보고 평가를 하는 프로그램을 생각 했습니다.

이번에 당신이 제목의 보고서는 n 질문의 문제가 1 문항 당 배 점의 각각 100/n 점입니다. 여기서 n은 100의 약 수입니다.

당신은 보고서 제출 기한을 두고 있었습니다. 제출 기한 지연 보고서 중에서 지연 된 기간이 9 일 보고 점수를 80%로 하기로 했습니다. 이 때 점수를 소수점이 하를 발생 하는 경우 잘립니다. 10 일 이상 지연 된 보고서 받음은 0 점으로 하기로 결정 했습니다.
図1

보고서 점수가 80 점 이상인 경우 해당 보고서의 등급은 A입니다. 70 점 이상 79 점 이하일 경우 B입니다. 60 점 이상 69 점 이하인 경우 C입니다. 59 점 이하인 경우에는 D가 됩니다.

당신은 k 인 분 보고 평가를 하기 위하여 려 고 하 고 있습니다. I 번째 학생 (1 ≤ i ≤ k)은 보고서를 마감 날짜를 기준으로 d_i 일 후에 제출 하 고 n 질문 중 a_i 질문에 답 했습니다.
그러나 d_i < 0이 보고서를 마감 날짜를 기준으로-d_i 일 이전에 신청 했다는 것을 나타냅니다. 또한, d_i = 0이 보고서를 기한 일에 발행 된 것으로 해석 하 고 보고서 점수가 80% 되는 것은 아닙니다.
이 때 학생 보고서 평가를 출력 하는 프로그램을 만들어 보겠습니다.

 */

package C;

import java.util.ArrayList;
import java.util.Scanner;

public class C077 {
    //보고서의 평가
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();      //학생수
        int n = scanner.nextInt();      //보고서 문제수
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int d = scanner.nextInt();  //기한 지난 정도
            int correct = scanner.nextInt();    //맞은 문제수
            int score = ((int)(correct * 100 / n));
            if (d >= 10) {
                score = 0;
            } else if (d >= 1 && d <= 9) {
                score = (int)(score * 0.8);
            } else {
                score = score;
            }
            result.add(test(score));
        }
        for (String w : result) {
            System.out.println(w);
        }
    }
    public static String test(int a) {
        if (a >= 80 && a<=100) {
            return "A";
        } else if (a>=70 && a<=79) {
            return "B";
        } else if (a>=60 && a<=69) {
            return "C";
        }else {
            return "D";
        }
    }
}