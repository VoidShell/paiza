/* C029: 여행 계획
여러분은 연휴에 N 일간의 여행을 갈 계획을 세우고 있습니다. 강 수 확률 예보를 보면, N 일 강수량 확률의 평균이 낮게 되는 날짜를 선택 합니다.

예)
연휴: 7 일간 (19 ~ 25 일)
여행 일정: 3 일
각 날짜 강수량 확률: 숫자

→ 여행 일정: 22 일-24 일

이 같은 형태로 연휴 날짜, 여행 날짜 및 각 날짜의 강 수 확율이 주어졌다 면, 강 확률의 평균이 낮게 되는 날짜를 선택 하십시오.

게다가 이런 일정을 여러 개 있다면 그 중 가장 빠른 것 을 출력 하십시오.
 */

package C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holidaysNum = scanner.nextInt();
        int planningdaysNum = scanner.nextInt();
        List<Integer> holidayDate = new ArrayList<>();
        List<Double> rainRate = new ArrayList<>();
        List<Double> rainRateAvg = new ArrayList<>();


        for (int i = 0; i < holidaysNum; i++) {
            holidayDate.add(scanner.nextInt());
            rainRate.add(scanner.nextDouble());
        }

        for (int i = 0; i < holidaysNum - planningdaysNum + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + planningdaysNum; j++) {
                sum += rainRate.get(j);
            }
            rainRateAvg.add((double) sum / planningdaysNum);
        }

        Double minRainAvg = Collections.min(rainRateAvg);
        int startday = holidayDate.get(rainRateAvg.indexOf(minRainAvg));

        System.out.print(startday + " " + (startday + planningdaysNum - 1));


    }

}
