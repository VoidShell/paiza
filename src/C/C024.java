/* C024: 미니 컴퓨터
제한 시간 카운트
타임 업!
당신의 친구인 K 씨는 전자 제품을 사랑 해요.
그는 매일 밤 시행착오를 거듭하여 최근에 결국 컴퓨터의 소형 버전을 개발에 성공 했습니다.

그는 다만 2 개의 변수를가지고 있으며, 두 변수는 모두 0으로 초기화 되어 있습니다.
또한, 그의 컴퓨터는 다음 세 가지 명령을 실행할 수 있습니다.

・ SET i a: 변수 i의 값 a를 할당 한다 (i = 1, 2)
/ADD a: 「 변수 값 1 + a 」를 계산 하 고 계산 결과를 매개 변수 2에 할당 하는
/SUB a: 「 변수 값 1-a 」를 계산 하 고 계산 결과를 매개 변수 2에 할당 하는

그 자신의 컴퓨터가 올바르게 작동 하는지 여부를 확인 하 라고 요청 하 여 왔습니다.
컴퓨터가 완료 행복 한 그의 요구를 사절 하는.
그런 그를 위해 그의 컴퓨터 시뮬레이션 프로그램을 쓰세요.

다음 그림은 예제 1의 변수 값의 변화를 보여 줍니다. */

package C;

import java.util.Scanner;

public class C024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calculateTimes = sc.nextInt();
        int first = 0;
        int second = 0;

        for (int i = 0; i < calculateTimes; i++) {
            String commend = sc.next();
            if (commend.equals("SET")) {
                if (sc.next().equals("1")) {
                    first = sc.nextInt();
                } else {
                    second = sc.nextInt();
                }
            } else if (commend.equals("ADD")) {
                second = first + sc.nextInt();
            } else if (commend.equals("SUB")) {
                second = first - sc.nextInt();
            }
        }

        System.out.printf("%d %d", first, second);
    }
}
