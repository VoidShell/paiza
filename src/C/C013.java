/* C013: 싫어하는 숫자
당신은 불행히도 병에 걸리는 것 입원 하 게 틀림 없습니다. 하지만 싫어하는 숫자입니다 숫자를 포함 하는 방 번호의 병 실에 들어서면 치료가 잘못은 없을까 걱정 되어 버립니다 ....

그래서 방 번호 어떤 자리에도 싫어하는 숫자가 포함 되어 있지 않은 병을 기입 하 여 입원 대상으로 했습니다.

1 번째 줄에 싫어하는 숫자 n (0에서 9 사이의 한 자리 숫자)
/두 번째 줄에 병 수 m
/3 번째 줄 이후 각 병원의 방 번호를 나타내는 정수 r_i (1 < = i < = m)

줄 구분선으로 주어 지기 때문에 원하는 병 실에 방 번호를 바꿈으로 구분 출력 하 라.

만약 희망 하는 병이 작동 하지 않는 경우 "none"을 출력 하 라.
 */

package C;

import java.util.ArrayList;
import java.util.Scanner;

public class C013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 싫어하는 숫자
        int m = scanner.nextInt();  // 병실 총 갯수
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < m; i++) {
            list.add(scanner.nextInt());
        }
        if (n >= 0 && n <= 9 && m >= 1 && m <= 100) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) >= 1 && list.get(i) <= 1000) {
                    String a = String.valueOf(list.get(i));
                    String b = String.valueOf(n);
                    if (!(a.contains(b))) {
                        System.out.println(a);
                    }
                    if (a.contains(b)) {
                        count++;
                        if (count == m) {
                            System.out.println("none");
                        }
                    }
                }
            }
        }
    }
}
