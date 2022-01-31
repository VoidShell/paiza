/* C064: paiza에서 식사
취업 사이트 paiza는 취업 생의 다이어트를 응원 하기 위해 레스토랑 paiza 처리를 시작 했습니다. 이 레스토랑은 뷔페식 이며, 취업 생의 건강 관리를 위해 각 요리에는 100 g 당 열 량이 써 있습니다.
요리의 품목 및 각 요리 100 g 당 칼로리, 또한 취업 생의 수와, 각각 먹은 양 (g)의 명부를 주어진 다, 그래서 당신은 각 취업 생이 섭취 한 열 량의 합계를 계산 하십시오.
또한 먹은 각 요리 열 량이 소수인 경우 소수점이 하를 버리고에서 합계를 계산 하십시오.

예를 들면, 입력 예제 1을 설명 하는 그림은 다음과 같습니다.

img

모든 취업 생이 먹은 요리의 양은 다음과 같습니다.

 */

package C;

import java.util.ArrayList;
import java.util.Scanner;

public class C064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  //음식수
        int b = sc.nextInt();  //학생수

        ArrayList<Integer> c = new ArrayList<>();  //음식 100그램당 열량 저장 리스트
        for (int i = 0; i < a ; i++) {
            c.add(sc.nextInt());
        }

        ArrayList<Integer> e = new ArrayList<>();  //섭취 총량 칼로리 저장 리스트
        for (int i = 0; i < b; i++) {
            int z = 0;
            for (int j = 0; j < a; j++) {
                z =  z + (sc.nextInt() * c.get(j) / 100);
            }
            e.add(z);
        }

        for (int i = 0; i < b; i++) {
            System.out.println(e.get(i));
        }
    }
}
