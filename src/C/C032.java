/* C032: 저렴 한 쇼핑
Paiza 카드는 매일 쇼핑 포인트입니다 좋은 포인트 카드입니다.
포인트 부여 기준은 상품의 종류에 따라 다음과 같이 달라 집니다.



포인트는 다음과 같이 계산 됩니다.

1. 상품 유형별 총 구매 금액을 계산 한다.
2. 각각의 포인트 부여 기준에 따라 상품의 종류별로 부여 점수를 계산 한다.
3. 상품 유형별 부여 점을 합계 하는. (100 엔 미만은 잘림)

쇼핑 내역 및 총 포인트의 예를 보자.

상품 1: 식료품 200 엔
상품 2: 책 240 엔
상품 3: 식료품 120 엔
상품 4: 기타 460 엔
상품 5: 책 240 엔
상품 6: 의류 3200 엔

식료품 총 320 엔 → 15 점
서적 총 480 엔 → 12 점
의류 총 3200 원 → 64 점
기타 합계 460 엔 → 4 점 = > 총 점 → 95 점
이와 같이 구입한 상품의 종류와 금액의 명부를 주어진 다, 그래서 쇼핑에 부여 되는 포인트의 합계를 구하십시오.
 */

package C;

import java.util.*;

public class C032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalProducts = scanner.nextInt();
        List<Integer> productSerial = new ArrayList<>();
        List<Integer> productPrice = new ArrayList<>();


        for (int i = 0; i < totalProducts; i++) {
            productSerial.add(scanner.nextInt());
            productPrice.add(scanner.nextInt());
        }
        int totalPrice0 = 0;
        int totalPrice1 = 0;
        int totalPrice2 = 0;
        int totalPrice3 = 0;

        for (int i = 0; i < totalProducts; i++) {
            if (productSerial.get(i) == 0) {
                totalPrice0 += productPrice.get(i);
            }
            if (productSerial.get(i) == 1) {
                totalPrice1 += productPrice.get(i);
            }
            if (productSerial.get(i) == 2) {
                totalPrice2 += productPrice.get(i);
            }
            if (productSerial.get(i) == 3) {
                totalPrice3 += productPrice.get(i);
            }
        }
        int point = (totalPrice0 / 100 * 5 + totalPrice1 / 100 * 3 + totalPrice2 / 100 * 2 + totalPrice3 / 100  * 1);

        System.out.print(point);
    }
}