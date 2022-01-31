/* C062: 회전 초밥 참 외
멜론을 좋아하는 당신의 회전 초밥가 게에 참 외를 먹으로 갔습니다.
재료는 각각 접시에 맞춰 하나씩 흐릅니다.

당신은 참 외를 먹고 극복에 전에 10 접시 흘러가는 시간이 걸립니다.
참 외를 먹고 있는 동안 새롭게 참 외를 받을 수 없습니다.

당신이 상점에 체류 하는 동안에 교류와 서 접시 수 T 및 전달 재료 목록이 주어 지는, 시간 동안에 먹 게 된 멜론의 개수를 출력 하는 프로그램을 만들어야 합니다.

참 외는 목록에서 "melon" 이라는 문자열이 표시 됩니다. 또한, 체류 시간이 끝난 시간에 먹는 참 외는 끝까지 먹는 것입니다.

다음은 예제 1을 그래픽적으로 나타낸 것입니다. 먹지 않는 재료는 연한 색으로 하 고 있습니다.

img
 */
package C;

import java.util.ArrayList;
import java.util.Scanner;

public class C062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();  //요리나오는수
        scanner.nextLine();  //엔터없애는 역할

        ArrayList<String> b = new ArrayList<>();  // 나오는 요리들 저장 리스트
        for (int i = 0; i < a; i++) {
            b.add(scanner.nextLine());
        }

        int result = 0;  //멜론먹는횟수 저장 변수
        for (int i = 0; i < a; i++) {  // 멜론 먹을떄마다 result 1증가 for문
            if (b.get(i).equals("melon")) {
                result ++;
                i = i + 10;
            }
        }

        System.out.println(result);
    }
}