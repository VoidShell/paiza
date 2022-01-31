/* C037: 애니메이션 일

심야 애니메이션의 방송 시작은 종종 "시"를 나타내는 부분의 숫자가 24 이상이 되는 것을 허용 하 고 다음과 같이 표현 될 수 있습니다.


01/27 24:30

이 날짜를 "시"의 부분이 0 이상 23 이하인 같은 표기법으로,


01/28 00:30

으로 나타낼 수 있습니다.


전자의 표기 방법은 때로 유용 하지 되지만 실제로 방송 된 "일"이 궁금 하다 면 후자 쪽이 편리 합니다.


그래서 시간이 주어 지기 때문에 "시"의 부분이 0 이상 23 미만 되도록 수정한 날짜와 시간을 출력 하는 프로그램을 만들어야 합니다.

그러나 "시"를 개정 하 고 날짜가 해당 월에 없는 일이 되었다 하더라도 월을 조정 하지 않고 그대로 출력 합니다. 혹시이 프로그램을 사용 하는 세계에서는 그런 날짜가 있는지 모르기 때문입니다.

 */

package C;

import java.util.Scanner;

//substring 과 포맷안에 02d 넣어서 남는자리 0으로 채우는것만 알면 풀필요x

public class C037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int day = Integer.parseInt(a.substring(3));
        int hour = Integer.parseInt(b.substring(0,2));
        if (hour>=24) {
            day += hour / 24;
            hour = hour % 24;
        }
        System.out.printf("%s%02d %02d%s", a.substring(0,3), day ,hour,b.substring(2));
    }
}