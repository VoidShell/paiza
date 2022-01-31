/* C048: 공짜로 마시는 커피
당신이 자주 이용 하 고 있는 커피숍 오늘 정식 서비스를 실시 하 고 있습니다.

ㆍ 커피를 구입 했을 때 다음 구매 가격을 추가로 P% off!
ㆍ 매번 가격 인하에 있어서 소수점이 하 잘림

당신은 가격 인하가 축적 하는 것에 눈을 붙였습니다.
커피를 또다시 마시고 있으면 공짜로 커피를 마실 수 있게 될 것입니다.

図1

공짜로 요구 하 고 당신은 얼마나 많은 원형 기울이면 지금부터 공짜로 주문할 수 있는지 계산 하 고 싶어 졌습니다.
실제로 프로그램을 써서 계산 해 보겠습니다.
 */

package C;

import java.util.Scanner;

//D랭크같은 C랭크 문제 풀어보실 필요 없음..

public class C048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int nextPay = a;
        int sum = a;
        for (int i = 0; i < 10000; i++) {
            if (nextPay > 0) {
                nextPay -= nextPay * 0.01 * b;
                nextPay = (int) Math.floor(nextPay);
                sum += nextPay;
            } else {
                System.out.println(sum);
                break;
            }
        }
    }
}
