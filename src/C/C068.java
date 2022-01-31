/* C068: 비밀 편지
당신은 친구와 비밀을 공유 하기 위하여 암호문을 만들고, 그 암호문을 원래 대로 프로그램을 만들 수 있습니다. 암호문을 되돌릴 때의 규칙은 다음과 같습니다.

ㆍ 전체 문장은 대문자 알파벳을 쓴다.
ㆍ 문자 번호는 왼쪽부터 순서 대로 1부터 세는 시작 한다.
/암호문 되돌리기 작업으로, 암호문 홀수 번째 문자는 각 문자를 알파벳의 반대 방향으로 N 문자 쫓아내고 짝수 번째 문자는 각 문자를 앞에 N 문자를 쫓아 냈다.
・ 이동한 문자 수 N은 서로에 게 알고 있다.

암호화 된 문자열 원래 문장을 이동한 문자 수 N가 주어 지기 때문에 취소 된 문자열을 출력 하는 프로그램을 만들어야 합니다.
그러나 문자를 쫓아낼 때, 알파벳 시작과 끝을 초과 하는 경우 각 알파벳의 끝, 알파벳의 처음부터 계속 생각 합니다.

입력 예 1 이면 왼쪽부터 세어 홀수 번째, Q와 P는 뒤로 네 글자 이동한 경우 해당 요소를 사용 하면 해당 M/L로 변환 되 고, 짝수 번째에 있는 E와 G는 앞으로 4 문자 이동한 경우 해당 요소를 사용 하면 각각 I와 K로 변환 됩니다.
따라서, 취소 된 문자열이 MILK가 됩니다.
 */

package C;

import java.util.Scanner;

public class C068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (i % 2 == 0) {
                char a = str[i];
                str[i] -= n;
                if (str[i] < 65) {
                    str[i] = (char) (91 - (n - (a - 65)));
                }
            }
            if (i % 2 == 1) {
                char b = str[i];
                str[i] += n;
                if (str[i] > 90) {
                    str[i] = (char) (64 + (n - (90 - b)));
                }
            }
        }
        String strr = String.valueOf(str);
        System.out.println(strr);
    }
}

