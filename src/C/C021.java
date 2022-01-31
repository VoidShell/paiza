/* C021: 폭풍에 있습니까?
태풍은 태풍의 눈 이라고 부르는 장소가 존재 합니다.
이것은 태풍 센터를 대표 하 고 있는 태풍의 영향을 받지 않습니다.

2 차원 평면상에서 태풍을, 심 혼은 동일 반지름은 두 개의 원형으로 모델링 합니다.
2 개 원의 중심의 좌표를 (xc, yc), 반지름을 각각 r_1, r_2 (r_1 < r_2) 이라고 합니다.

남자의 좌표를 (x, y) 하면 다음과 같이 みたす 때, 몇몇 남자는 태풍의 폭풍에 정의 합니다.


태풍 정보와 여러 사람의 협조를 받게 되기 때문에, 각 사람에 게 폭풍 영역에 있는지 여부를 확인 하십시오.

입력 예 1을 나타낸 그림
 */

package C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xc = sc.nextInt();	// 원의 중심 x좌표
        int yc = sc.nextInt();	// 원의 중심 y좌표
        int r1 = sc.nextInt();	// 작은 원의 반지름
        int r2 = sc.nextInt();	// 큰 원의 반지름

        int n = sc.nextInt();	// 임의의 위치의 수

        List<Integer> X = new ArrayList<>();	// 임의의 위치 x좌표
        List<Integer> Y = new ArrayList<>();	// 임의의 위치 y좌표

        for (int i = 0; i < n; i++) {
            X.add(sc.nextInt());	// 임의의 위치 x좌표 입력
            Y.add(sc.nextInt());	// 임의의 위치 y좌표 입력
        }

        for (int i = 0; i < n; i++) {
            if (Math.pow(r1, 2) <= (Math.pow((X.get(i) - xc), 2) + Math.pow((Y.get(i) - yc), 2))
                            && Math.pow(r2, 2) >= (Math.pow((X.get(i) - xc), 2) + Math.pow((Y.get(i) - yc), 2))) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}