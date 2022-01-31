/* C049: 【 파 만지고 접시! 협력적 문제 】 엘리베이터
당신은 기리시마 쿄 코 들이 다니는 파이 더 여 학원의 청소부로, 학원에 비치 되어 있는 엘리베이터를 관리 하 고 있습니다.
승강기가 일정 거리를 달릴 경우 정기 점검을 해야 않습니다.
엘리베이터의 운동 로그를 바탕으로 엘리베이터가 何階分 거리를 달린 지 계산 하는 프로그램을 완성 합니다.
그러나 엘리베이터는 1 층에 있다고 합니다.

다음은 예제 1을 그림으로 나타낸 것입니다.
 */

package C;

import java.util.ArrayList;
import java.util.Scanner;

public class C049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            b.add(sc.nextInt());
        }
        int c = 0;
        c = b.get(0) - 1;

        for (int i = 1; i < a; i++) {
            c = c + Math.abs(b.get(i) - b.get(i - 1));
        }
        System.out.println(c);
    }
}
