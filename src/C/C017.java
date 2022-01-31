/* C017: 하이 앤 로우/카드 게임
Paiza 카드 게임은 여러 개의 부속 카드 각 1 개의 부모 카드로 얼마 관계로 승부 하는 게임입니다.

카드에 두 개의 숫자가 써 있습니다.
첫 번째 번호는 1에서 10 사이의 정수 두 번째 숫자 1에서 4 사이의 정수로 표현 됩니다.
또한 2 개의 번호 조합이 하나의 카드 뭉치에 포함 되어 있습니다. (같은 카드가 2 장 이상 존재 하지 않습니다)

2 카드의 강 약 관계는 다음 규칙에 따라 결정 됩니다.
ㆍ 첫 번째 번호가 큰 카드 쪽이 강한
1 번째 번호가 동일한 경우 두 번째 번호가 작은 카드 쪽이 강한

부모 카드로 자식 카드 정보가 제공 되기 때문에, 그들의 강 약 관계를 알아내는 프로그램을 만들어야 합니다.
*/

package C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();	// 부모 카드 a
        int b = sc.nextInt();	// 부모 카드 b

        int n = sc.nextInt();	// 자식 카드의 수

        List<Integer> A = new ArrayList<>();	// 자식 카드 A의 리스트
        List<Integer> B = new ArrayList<>();	// 자식 카드 B의 리스트

        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());	// 자식 카드 A 입력
            B.add(sc.nextInt());	// 자식 카드 B 입력
        }

        for (int i = 0; i < n; i++) {
            if (a > A.get(i)) {
                System.out.println("High");
            } else if (a < A.get(i)) {
                System.out.println("Low");
            } else if (a == A.get(i)) {
                if (b > B.get(i)) {
                    System.out.println("Low");
                } else {
                    System.out.println("High");
                }
            }
        }
    }
}
