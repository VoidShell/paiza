/* C078: 주식 매매
제한 시간 카운트
あと0時間59分56秒
당신은 주식 매매를 통해 돈을 버는 믿습니다.
N 일 동안 하루에 한 번 주가를 확인 하 고 다음 규칙에 따라 매매를 합니다.

・ 주가가 c_1 엔 이하의 경우, 주당 살
ㆍ 주가가 c_2 엔 이상의 경우 주식 모두 팔고
, 주가가 c_1 원형 c_2 원의 사이에 있는 경우에는 아무것도 하지 않는
/N 일째 위의 없이 주식을 전부 매도

N 일에 주식을 모두 팔고 나면 손익을 산출 하십시오. 그러나 입력 예제 2와 같이 손익을 가감 할 수 있음을 유의 하십시오.
*/

package C;

import java.util.Scanner;

import java.io.IOException;
import java.util.ArrayList;

public class C078 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int N = Integer.parseInt(s.split(" ")[0]);
        int buyPrice = Integer.parseInt(s.split(" ")[1]);
        int sellPrice = Integer.parseInt(s.split(" ")[2]);

        ArrayList<Integer> priceList = new ArrayList<>();
        for (int i = 0; i < N; i ++) {
            priceList.add(Integer.parseInt(sc.next()));
        }

        int profit = 0;
        int asset = 0;
        for (int i = 0; i < N; i ++) {
            if (i == N - 1 && asset > 0) {
                profit = profit + (asset * priceList.get(i));
                asset = 0;
                System.out.println(profit);
            } else if (i == N - 1) {
                System.out.println(profit);
            } else if (priceList.get(i) <= buyPrice) {
                profit = profit- priceList.get(i);
                asset = asset + 1;
            } else if (priceList.get(i) >= sellPrice && asset > 0) {
                profit = profit + (asset * priceList.get(i));
                asset = 0;
            }
        }
    }
}