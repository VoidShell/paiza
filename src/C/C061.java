/* C061: 위로 이동 없는 덧셈
당신은 아 이들이 수학 공부를 확인 하 고 있습니다. 이들이 덧셈을 할 때 손가락으로 세어 서 추가 하기 때문에 위로 이동를 계산할 수 없습니다. 그러나 당신은 아이 들에 게 달콤한, 계산 결과로도 정답에 했습니다.

정수가 두 부여 되기 때문에 아이의 계산 방법으로 계산 된 결과를 출력 하는 프로그램을 만들어야 합니다.
그러나 입력 예제 2와 같이 첫 번째 숫자가 0으로 설정 된 경우에도 생략 하지 않고 0을 출력 하십시오.

예를 들어, 예제 1에서는 아 이들이 그림과 같이 계산 합니다.

한 자리에서 8 + 5를 계산 하 여 13 곳을 하나씩 증가 계산 수 없기 때문에 3, 십의 자리는 9 + 7을 계산 하 여 16 곳을 6으로 설정 됩니다. 의해 계산 결과는 98 + 75 = 63입니다.

따라서 63가 출력 됩니다.
 */

package C;

import java.util.Scanner;

public class C061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = a + b;
        int a1 = (int) a / 100;
        int a2 = (int) ((a - a1 * 100) / 10);
        int a3 = a - a1 * 100 - a2 * 10;
        int b1 = (int) b / 100;
        int b2 = (int) ((b - b1 * 100) / 10);
        int b3 = b - b1 * 100 - b2 * 10;
        if ((a3 + b3) >= 10) {
            result = result - 10;
        }
        if ((a2 + b2) >= 10) {
            result = result - 100;
        }
        if ((a1 + b1) >= 10) {
            result = result - 1000;
        }
        if (a > 100 || b > 100) {
            System.out.printf("%03d", result);
        } else if (a > 10 || b > 10) {
            System.out.printf("%02d", result);
        } else {
            System.out.println(result);
        }
    }
}
