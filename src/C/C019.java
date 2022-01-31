/* C019: 완전 수와 거의 완전 수
제한 시간 카운트
타임 업!
N을 1 보다 큰 정수로, N의 약 수 중 N 자신을 뺀 합계를 S 라고 합니다. 이 때

, N = S와 같은 N을 완전 수
| N-S| = 1 인 N을 거의 완전 수

라고 하자. 여기에 | N-S| 는 N-S 절대값을 의미 합니다.

예를 들어, N = 28 이면 28 약 수는 1, 2, 4, 7, 14, 28, S = 1 + 2 + 4 + 7 + 14 = 28입니다. 따라서, 28은 완전 수입니다.
또한, N = 16 일 때 S = 1 + 2 + 4 + 8 = 15 이므로 16는 거의 완전 수입니다.

입력 된 정수는 완전 수 또는 거의 모든 수 지 중에도 있는지 확인 하는 프로그램을 만들어야 합니다.
*/

package C;

import java.util.ArrayList;
import java.util.Scanner;


public class C019 {

    public static void number(int num) {
        int sum = 0;
        int i;

        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            System.out.println("perfect");
        } else if (num == sum + 1 || num == sum - 1) {
            System.out.println("nearly");
        } else {
            System.out.println("neither");
        }
    }

    public static void main(String[] args) {
        //C019 전체 수와 거의 수
        Scanner scanner = new Scanner(System.in);


        //Q만큼의 정수를 입력을 받아
        int Q = scanner.nextInt();

        //받은 정수들을 배열에 저장
        ArrayList<Integer> inputs = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            inputs.add(scanner.nextInt());
        }
        for (int i = 0; i < Q; i++) {
            number(inputs.get(i));
        }


    }

}
