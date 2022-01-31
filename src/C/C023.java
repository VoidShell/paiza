/* C023: 지 당첨 번호
오늘은 PAIZA 6 라는 복권 당첨 번호 공개 일입니다.

PAIZA 6 구입자는 1에서 100까지 좋아하는 숫자를 6 개 선택 하십시오.
복권 처럼 6 개의 당첨 번호가 발표 되 고 구입한 복권의 숫자와 일치 하는 숫자의 개수에 따라 경품이 있습니다.

당신은 최근 N 개의 복권을 구입 했습니다.
프로그래머는, N 개의 복권 마다 당첨 번호와 일치 하는 숫자의 개수를 확인 하기 위해 프로그램을 작성 하기로 했습니다.

이제 복권 구입 예제를 살펴보겠습니다.

에서 N = 3의 예제는 당첨 번호와 일치 하는 숫자는 빨간색 글꼴로 표시 되 고 위에서 아래로 3 개 0 개입니다.
게다가, 예제에서 보는 바와 같이, 복권의 숫자는 상승 하는 것 순으로 나열 하는 것은 아닙니다.
 */

package C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> winNum = new ArrayList<>();
        int ticketAmount = 0;
        List<Integer> lotteryNum = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            winNum.add(scanner.nextInt());
        }
        ticketAmount = scanner.nextInt();
        for (int i = 0; i < winNum.size() * ticketAmount; i++) {
            lotteryNum.add(scanner.nextInt());
        }


        for (int i = 0; i < ticketAmount; i++) {
            int count = 0;
            for (int j = 0; j < winNum.size(); j++) {
                for (int k = winNum.size() * i; k < winNum.size() * (i + 1); k++) {
                    if (lotteryNum.get(k) == winNum.get(j)) {
                        ++count;
                    }
                }
            }
            result.add(count);
        }

        for (int i = 0; i < result.size() - 1; i++) {
            System.out.println(result.get(i));
        }
        System.out.print(result.get(result.size() - 1));

    }
}
