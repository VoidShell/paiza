/* C026: 토끼와 당근
제한 시간 카운트
あと0時間59分17秒
Rabbit 사의 사장은 토끼를 사랑 하 고, 회사에서 1 마리의 토끼를 사육 하는 것을 결정 했다.
토끼가 인삼을 좋아하는 것은 널리 알려져 있습니다. 또한 토끼에 상세한 직원에 따르면, 인삼은 당분이 많아서 여 너무 좋지 않은 것 같습니다.

그래서 인삼은 1 일 1 책만 주는 것으로, 특히 당도가 허용 범위 내에서 질량이 큰 인삼을 선택 했습니다.

프로그래머는 Rabbit 사의 의뢰를 받아 1부터 N에서 열거 된 N 개의 인삼의 데이터를 입력 하 여 당도가 허용 범위 내에서 질량의 가장 큰 인삼을 찾는 프로그램을 만들 수 있습니다.

설탕은 기준 값 S와 p의 포용 력 있고 당도가 S-p 이상 S + p 이하인 경우 허용 범위에 포함 됩니다.
또한 설탕이 허용 범위 내에서 질량의 가장 큰 인삼이 여러 개 있는 경우에는 그 자료의 가장 작은 것을 알 수 있다면 충분 합니다.

예를 들면, 입력 예 1은 다음과 같이 되어 있습니다.
 */
package C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int sugar = scanner.nextInt();
        int errorRange = scanner.nextInt();
        int result = 0;
        List<Integer> weightList = new ArrayList<>();
        List<Integer> sugarList = new ArrayList<>();
        List<Integer> sortedIndexList = new ArrayList<>();
        List<Integer> sortedweightList = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            weightList.add(scanner.nextInt());
            sugarList.add(scanner.nextInt());
        }

        for (int i = 0; i < amount; i++) {
            if (sugarList.get(i) >= sugar - errorRange && sugarList.get(i) <= sugar + errorRange) {
                sortedIndexList.add(i);
            }
        }

        for (int i = 0; i < sortedIndexList.size(); i++) {
            sortedweightList.add(weightList.get(sortedIndexList.get(i)));
        }


        if (sortedIndexList.size() == 0) {
            System.out.print("not found");
        } else {
            int maxweight = Collections.max(sortedweightList);
            result = sortedIndexList.get(sortedweightList.indexOf(maxweight)) + 1;
            System.out.print(result);
        }

    }
}