/* C074: 【 クロニクルコラボ 문제 】 글 크기 변경
Paiza는 데스크톱 응용 프로그램을 개발 하 고 있습니다. Paiza는 해당 응용 프로그램 창의 크기를 조정 하면 텍스트 표시 부분의 크기도 비슷하게 변경 되어 문장 표시 부분의 너비에 맞게 자연스럽 게 줄 수 있다는 것을 내 것 이라고 생각 합니다.
Paiza 당신 대신 현재 문법 표시 부분의 높이와 너비 및 변경 후의 너비를 사용 하 여 새로 표시 된 텍스트를 표시 하는 프로그램을 만들어야 합니다.

입력 예 1의 경우 다음 그림과 같이 높이 6 행 너비가 8 문자 문장이 주어 지 고 있습니다.
그래서 일단 하나의 문자열로, 너비는 6 개 문자를 줄 바꿈 하 여 출력 예제 1과 같이 출력 될 수 있습니다.
 */

package C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.*;

public class C074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int X = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < H; i++) {
            String s = scanner.next();
            sb.append(s);
        }

        System.out.println(sb);

        for (int i = 0; i < sb.length(); i += X) {
            for (int j = i; j < i + X; j++) {
                System.out.print(sb.charAt(j));
                if (j == sb.length() - 1) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
