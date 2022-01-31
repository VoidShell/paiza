/* C020: 남은 금액
당신은 슈퍼마켓을 운영 하 고 있습니다.

이제 신선한 음식을 m [kg] 구입 했습니다. 매우 신선 했기 때문에, 원시 판매 했었던 곳에, m [kg] 중 p [%]를 판매할 수 있습니다.
다음 팔을 전부 씨리얼에 판매 하 여 팔리고 남아 있었다 용량 중 q [%]가 팔 렸
음, m [kg] 들여온이 식품은 궁극적으로 무엇 kg 팔 남아 있었다?
그러나, 신선한 식품을 싸고 하는 양을 바꾸기 없이 요리 할 수 있습니다.

입력 예 1을 나타낸 그림
*/

package C;

import java.util.Scanner;

public class C020 {
    public static void main(String[] args) {
        // C20 남은양
        // Math.round() 반올림 안다면 풀어볼 필요 없음
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double result =  a * (1 - b * 0.01) * (1 - c * 0.01);
        System.out.print(result);
    }
}