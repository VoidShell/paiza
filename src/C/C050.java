/* C050: 경매 결과
A 씨와 B 씨가 각각 창조 했다 자동 거래 프로그램, 그러나 몇몇 상품을 사기 위해 경매에 참여 하 고 있습니다.

상품 가격은 S 엔부터 시작 합니다. A 씨와 B 씨가이 순서로 교체 가격을 올리고 갑니다.

ㆍ A 씨가 만든 자동화 된 트레이딩 프로그램은 지금 제품 가격에 10 원을 더한 가격 협상 합니다.
ㆍ B 씨가 만든 자동화 된 트레이딩 프로그램은 현재 상품의 가격에 1000 원을 더한 가격 협상 합니다.

図1

A 씨의 예산은 a 서클, B 씨의 예산은 b 원입니다. 자동 거래 프로그램은 예산을 초과 하는 가격에 협상을 하려고 할 때 중지 합니다.

A 씨와 B 씨가 어떤 상품을 낙찰 된 지도를 출력 하십시오.

보기)

S = 1, a = 1500, b = 2050 때

상품은 1 선에서 거래가 이루어집니다.

1. 먼저 A 씨의 프로그램이 11 엔 협상을 합니다.
2. 다음으로, B 씨의 프로그램이 1011 엔 협상을 합니다.
3. 다음에 A 씨의 프로그램이 1021 원에 협상을 합니다.
4. 다음으로, B 씨의 프로그램이 2021 원에 협상을 합니다.
5. A 씨의 예산은 1500 엔, 2021 원에서 10 원 올렸다 2031 원형에서 협상할 수 없습니다. 따라서 A 씨의 자동 거래 프로그램을 중지 합니다.
 */

package C;

import java.util.Scanner;

public class C050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s_price = scanner.nextInt();
        int a_asset = scanner.nextInt();
        int b_asset = scanner.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i < 1000; i++) {
            if (s_price + 10 >= a_asset) {
                b += 1;
                break;
            } else {
                s_price += 10;
            }
            if (s_price + 1000 >= b_asset) {
                a += 1;
                break;
            } else {
                s_price += 1000;
            }
        }
        if (a == 1) {
            System.out.println("A" + " " + s_price);
        } else if (b == 1) {
            System.out.println("B" + " " + s_price);
        }
    }
}
