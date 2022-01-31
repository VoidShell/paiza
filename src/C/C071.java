/* C071: 직각 삼각형
당신은 모든 변의 길이가 정수 이다 직각 삼각형을 계산 되었습니다.

그러나이 조건을 만족 하는 삼각형 모두 센다 면 끝이 없을 때문에, 다음의 조건을 만족 하는 삼각형을 계산 했습니다.

ㆍ 검사 직각 삼각형은 직각 오른쪽에 있다.
ㆍ 전체 면은 정수 이다.
ㆍ 이다 주어진 두 정수 M, N이 주어 지 고 M 보다 길이가 작은 아래쪽 N 보다 작은 높이 이다.
*/

package C;

import java.util.Scanner;

public class C071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k <= 900; k++) {
                    if ((Math.sqrt((Math.pow(i, 2) + Math.pow(j, 2)))) == k) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}