/* C034: 선생님의 숙제
제한 시간 카운트
あと0時間58分31秒
여러분은 초등학교 1 학년 선생님입니다. 이번 수업을 통해 덧셈과 뺄셈을 가르치고 있습니다. 당신은 더하기와 빼기를 이용한 숙제를 만들어야 그 프로그램을 쓰기로 했습니다.

다음 단계에 따라 문제를 임의로 생성 하는 프로그램을 다시 수 것입니다, 그들의 답변을 요구 하는 프로그램은 아직 없습니다. 답변을 요구 하는 프로그램을 작성 하십시오.

[문제 생성 절차]

1. 올바른 식 a + b = c, 또는 a-b = c (a, b, c, 정수)를 생성 한다
2. A, b, c 중 하나를 비워

이 비어 야 정수가 "응답"입니다.

여기에서, 덧셈, 뺄셈의 문제에 대 한 예제를 하나씩 보여 줍니다.
 */

package C;

import java.util.Scanner;

public class C034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String[] strArray = a.split(" ");

        if (strArray[0].equals("x")) {
            int b = Integer.parseInt(strArray[2]);
            int c = Integer.parseInt(strArray[4]);
            if (strArray[1].equals("+")) {
                System.out.println(c - b);
            } else if (strArray[1].equals("-")) {
                System.out.println(b + c);
            }
        } else if (strArray[2].equals("x")) {
            int b = Integer.parseInt(strArray[0]);
            int c = Integer.parseInt(strArray[4]);
            if (strArray[1].equals("+")) {
                System.out.println(c - b);
            } else if (strArray[1].equals("-")) {
                System.out.println(b - c);
            }
        } else {
            int b = Integer.parseInt(strArray[0]);
            int c = Integer.parseInt(strArray[2]);
            if (strArray[1].equals("+")) {
                System.out.println(b + c);
            } else {
                System.out.println(b - c);
            }
        }
    }
}