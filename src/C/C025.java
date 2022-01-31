/* C025: 팩스 용지 철수
당신이 받은 팩스를 팩스 기계까지가 서 일을 담당 하 고 있습니다.
하지만 데스크에서 팩스 기계 까지는 멀 기 때문에, 당신은 항상가 서 횟수를 최소화 합니다. 오늘은 몇 번 종이를가지고 갈 필요가 있을까요?

이상적으로는 하루에 1 번만 갈 것이 이상적 이지만, 실제로는 두 가지 문제가 있습니다.

첫째, 주어진 종이의 수가 너무 많아 한 번에 모두 전할 수 없다는 것입니다.
예를 들면, 종이 100 장에 도착할 때, 당신은 한 번에 30 장의 사진을 집어넣을 경우 4 번 50 장까지 집어넣을 경우 2 번가 서 해야 합니다.
둘째, 너무 장시간 팩스로 받은 종이를가지고 가지 않으면 상사에 게 미치게 될 것입니다.
특히 x 시 y 분 받은 종이는 x 시 59 분까지 데리 러가 야 겠어요 화 됩니다.

예를 들면,

3 시 20 분 70 매
/3 시 40 분에 170 장
/오후 3 시 59 분에 90 매
/오후 4 시 5 분에 55 개
, 4 시 25 분에 40 장

도착 하면, 당신은 한 번에 대하여 50 장의 효과가 발동 합니다. 이 시간, 오후 3 시 59 분까지가 서 필요한 종이의 매수는 70 + 170 + 90 = 330 매입니다. 당신은 한 번에 50 개만 전할 수 없기 때문에, 최소 7 번 갈 필요가 있습니다. 4 시 59 분까지가 서 필요한 종이의 매수는 55 + 40 = 95 개에 최소 2 번가 서 해야 합니다. 이 경우, 7 + 2 = 9 번 종이를 얻을 수 있어야 합니다.

당신이 한 번에 운반할 수 종이 최대 매수 M, 오늘 하루에 팩스가 전달 횟수 N, 또는 N 번 마다 언제 枚 장의 종이를 받을 것인지에 대 한 정보가 제공 됩니다. 이 정보를 사용 하 여 오늘, 팩스로 몇 번 종이를가지고 갈 필요가 있는지를 물어 라.
 */

package C;

import java.util.ArrayList;
import java.util.Scanner;
public class C025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> paperSumList = new ArrayList<>();  //도착종이수 저장 리스트
        int a = scanner.nextInt(); //옮기는 최대치
        int b = scanner.nextInt(); //팩스온 횟수
        int time = 0;
        int paperSum = 0;
        for (int i = 0; i < b; i++) {
            int tmptime = scanner.nextInt();        //시간
            scanner.next();                         //분
            int paper = scanner.nextInt();          //옮길종이
            if (time == tmptime) {
                paperSum += paper;
                time = tmptime;
            } else {
                paperSumList.add(paperSum);
                paperSum = 0;
                paperSum += paper;
                time = tmptime;
            }
        }
        paperSumList.add(paperSum);

        int lift = 0;
        for (int i = 0; i < paperSumList.size(); i++) {
            if (paperSumList.get(i) % a == 0) {
                lift += paperSumList.get(i) / a;
            } else {
                lift += paperSumList.get(i) / a + 1;
            }
        }
        System.out.println(lift);
    }
}
