/* C036: [만약 여자 협력적 문제] 개썰매 대회
1부터 4까지 등록 번호를가지고 4 명이, 남극에서 열리는 개썰매 대회 경주 대회에 참가 합니다. 1 라운드에서는 참가자의 2 명 쌍에 작별 인사를 경쟁 하 게 됩니다. 각 상위 시킨 2 인이 2 라운드에 진출 하 여 2 라운드 우승자가이 게임의 승자가 됩니다.

먼저 1 라운드 組み分け가 부여 됩니다. 그리고 첫 라운드의 각 참여자의 시간 (초)이 연속적으로 2 라운드 각 참가자 들의 시간 (초)이 출품작 번호 오름차순으로 부여 되기 때문에 우승자와 준 우승자를 요청 하십시오. 게다가,1 라운드, 2 라운드에서 각 참가자는 모든 다른 값 이며 同着은 없다고 합니다 .


예)


라운드 組み分け: 1 vs 3, 2 vs 4

라운드 타임:
1 → 988 초
2 → 876 초
3 → 921 초
4-906 초

이 1 vs 3는 3 승리, 2 vs 4에서는 2의 승리입니다. 따라서 2 라운드 2 vs 3에서 겨 루어 지 고 있습니다.

2 라운드 타임:
2 → 866 초
3 → 911 초

2 라운드 우승자는 2로 서 챔피언은 2, 준 우승자는 3입니다. 이 예제는 아래의 예제 1에 대응 하 고 있습니다.

 */

package C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int game1winner = 0;
        int game2winner = 0;
        int finalwinner = 0;

        List<Integer> game1Order = new ArrayList<>();
        List<Integer> game2Order = new ArrayList<>();
        List<Integer> firstSetScore = new ArrayList<>();
        List<Integer> secondSetcore = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            game1Order.add(scanner.nextInt());
        }

        for (int i = 0; i < 2; i++) {
            game2Order.add(scanner.nextInt());
        }

        for (int i = 0; i < 4; i++) {
            firstSetScore.add(scanner.nextInt());
        }
        for (int i = 0; i < 2; i++) {
            secondSetcore.add(scanner.nextInt());
        }


        if (firstSetScore.get(game1Order.get(0) - 1) < firstSetScore.get(game1Order.get(1) - 1)) {
            game1winner = game1Order.get(0);
        } else {
            game1winner = game1Order.get(1);
        }


        if (firstSetScore.get(game2Order.get(0) - 1) < firstSetScore.get(game2Order.get(1) - 1)) {
            game2winner = game2Order.get(0);
        } else {
            game2winner = game2Order.get(1);
        }

        if (secondSetcore.get(0) < secondSetcore.get(1)) {
            System.out.println(Math.min(game1winner, game2winner));
            System.out.print(Math.max(game1winner, game2winner));

        } else {
            System.out.println(Math.max(game1winner, game2winner));
            System.out.print(Math.min(game1winner, game2winner));
        }

    }
}
