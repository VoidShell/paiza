/* C075: 포인트 결제
Paiza 도시에 살고 있는 당신은, 평상시의 이동 수단은 모두 paiza 버스를 사용 합니다. Paiza 버스에서는 paica 라는 IC 카드 승차권으로 사용할 수 있습니다. 사전에 paica에 충전 하 여 사용할 수 있습니다.

버스 요금 지불 paica 카드 잔액을 사용 하면 요금의 10%가 paica 점으로 웅덩이.

당신은 카드 잔금 및 지점을 얼마나 사용 되었는지 알기 위한 프로그램을 작성 하기로 했습니다.

당신이 처음으로 충전 하는 현금으로 버스를 이용 했을 때 소요 된 비용의 명부를 주어진 다, 그래서 각 차 시 남은 돈으로 점수를 산출 하십시오.

그러나 도중에 카드 잔액과 포인트 모두 일주를 놓치지 않습니다.

입력 예 1은 다음과 같이 됩니다.
 */
package C;

import java.util.ArrayList;
import java.util.Scanner;

public class C075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = scanner.nextInt();
        int takeTimes = scanner.nextInt();
        int point = 0;
        int busFare;

        ArrayList<String> result = new ArrayList<>();  //수정추가 결과값 요상하게 나와서 출력이쁘게하기위한 리스트생성
        for (int i = 0; i < takeTimes; i++) {
            busFare = scanner.nextInt();
            if (busFare > point) {
                balance = balance - busFare;
                point = point + (busFare / 10);
                result.add(balance + " " + point);  //결과값 리스트에 저장
            } else if (busFare <= point) {
                point = point - busFare;
                result.add(balance + " " + point);  //결과값 리스트에 저장
            }
        }

        //모은결과값 한방에 출력
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}

