/* C022: 원통형
변이 계속 주가의 모습을 알기 때문에 시가, 종가, 고가 라는 4 가지 주가 자주 사용 됩니다.

1 일 4 종류의 주가는 각각 다음과 같이 결정 됩니다.

/시 1 일의 첫번째 주가
/종가는 1 일 지난 주가
/기록은 1 일 최대 재고
/가격: 1 일 최소의 주가

또한 n 일간의 4 종류의 주가는 각각 다음과 같이 결정 됩니다.

ㆍ 시가가 첫째날의 시가
및 종가는 n 일째 종가
/기록은 1 일째부터 n 일째 까지의 최대 90
/가격: 1 일째부터 n 일째 까지의 최소 가격:

표는 1 일 4 종류의 주가를 5 일간 보여줍니다.

5 일간 4 종류의 주가는 표에서 빨간색으로 작성 된 주가가 나타내며 각 시가 11, 종가가 13, 비싼 값이 17, 8입니다.

11 5 일 시에서 1 시가, 종가가 5 일 종가의 5 일 종가, 17는 5 일간의 기록 중에서 가장 높은 8 5 일 가격: 안에 최소 가격으로 되어 있습니다.

4 종류의 주가가 1 일째부터 n 일 분 부여 되기 때문에, n 일간의 4 종류의 주가를 구하는 프로그램을 작성 하십시오.
 */

package C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C022 {
    public static void main(String[] args) {
        //C022 촛대
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<Integer> siga = new ArrayList<>();
        ArrayList<Integer> jongga = new ArrayList<>();
        ArrayList<Integer> maxga = new ArrayList<>();
        ArrayList<Integer> minga = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            siga.add(scanner.nextInt());
            jongga.add(scanner.nextInt());
            maxga.add(scanner.nextInt());
            minga.add(scanner.nextInt());
        }

        System.out.print(siga.get(0) + " ");
        System.out.print(jongga.get(n - 1) + " ");
        System.out.print(Collections.max(maxga) + " ");
        System.out.print(Collections.min(minga));

    }
}
