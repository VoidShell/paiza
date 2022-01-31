/* C067: 【 해커 입문 협력적 문제 】 숫자 공부
여러분은 이진수에 대해서 공부 했습니다.
거기에서, 당신은 어떤 숫자로 2 진수 표시 어떤 숫자가 1 인지 또는 0 인지 궁금해 졌습니다.

알고 싶은 자리가 지정 되기 때문에,이 숫자가 0 인지 1 인지 확인 하는 프로그램을 만들어야 합니다.
알고 싶은 자리는 주어진 숫자를 2 진수로 때 자릿수 보다 작은 것으로 간주 합니다.

입력 예 1의 경우, 아래 그림과 같이 주어진 숫자는 44 이기 때문에, 2 진수로 경우 101100입니다. 그리고 출력 되는 값은 순서 대로 오른쪽에서 4 번째, 2 번째, 6 번째 숫자, 1, 0, 1의 각 번호에 있는 줄 바꿈을 포함 됩니다.
 */

package C;

// C067 숫자의 조사

import java.util.ArrayList;
import java.util.Scanner;

public class C067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        // 2진수를 담을 ArrayList
        ArrayList<Integer> binaryX = new ArrayList<>();
        // k_N 을 담을 ArrayList
        ArrayList<Integer> unitsBinary = new ArrayList<>();


        int count = 0;
        int tempX = X;

        // 2진법 자리 수를 구하기 위한 count
        for ( ; ; ) {
            tempX = tempX / 2;
            count++;

            if (tempX == 0) {
                break;
            }
        }

        // k_N을 스캔하여 대입
        for (int i = 0; i < N; i++) {
            unitsBinary.add(i, scanner.nextInt());
        }

        // 2진법을 담는 ArrayList를 0으로 초기화
        for (int i = 0; i < count; i++) {
            binaryX.add(i,0);
        }

        // 2진법 ArrayList에 2진값(0 or 1)을 index의 역순으로 대입
        for (int i = 0; i < count; i++) {
            binaryX.set(count - i - 1, X % 2);
            X = X / 2;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(binaryX.get(count - unitsBinary.get(i)));
        }
    }
}