/* C015: 포인트 카드 계산
지금은 월. 이제 달 가계부를 붙이지 않는다 면 안됩니다. 귀하의 손끝에서, 그리고 몇몇 슈퍼마켓의 영수증의 산이 있습니다.

슈퍼마켓에는 포인트 카드가 도입 되어, 쇼핑을 할 때마다 구매 금액에 따라 포인트가 적립 됩니다. 적립 된 포인트는 다음 세 가지 규칙에 따라 결정 됩니다.

1. 보통은 구매 금액의 1% (소수점이 하 잘림)
2. 그러나 3 세우는 일은 구매 금액의 3% (소수점이 하 잘림)
3. 그러나 5 세우는 일은 구매 금액의 5% (소수점이 하 잘림)

당신이 포인트 카드에, 지금은 얼마나 많은 점이 많아서 인지 궁금해 졌습니다. 영수증의 수가 많기 때문에, 손으로 계산 하기가 힘듭니다.

이제 이것을 계산 하는 프로그램을 쓰세요. 그러나, 이번 달 처음에는 총 점이 많아서 없으며 (0 점), 한 달 동안 포인트는 소모 되지 않았다 합니다.
 */

package C;

import java.util.ArrayList;
import java.util.Scanner;

public class C015 {
    public static void main(String[] args) {
        //C015 포인트 카드 계산
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<String> dates = new ArrayList<>();
        ArrayList<Integer> amount = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dates.add(scanner.next());
            amount.add(scanner.nextInt());
        }
        ArrayList<Integer>sums = new ArrayList<>();
        int add = 0;
        for (int i = 0; i < n; i++) {
            if (dates.get(i).contains("3")) {
                sums.add(( amount.get(i) * 3 ) / 100);
            } else if (dates.get(i).contains("5")) {
                sums.add(( amount.get(i) * 5 ) / 100);
            } else {
                sums.add((amount.get(i)) / 100);
            }
            add += sums.get(i);
        }
        System.out.println(add);
    }
}