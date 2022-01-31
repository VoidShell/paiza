/* C016: Leet 문자열
제한 시간 카운트
타임 업!
Leet 라는 인터넷 속어입니다.
Leet는 어떤 알파벳을 비슷한 모양으로 다른 문자를 대체 하 여 표기 합니다. Leet 대체 규칙은 여러 가지가 있지만 여기에서는 다음 대체 규칙만을 생각 합시다.
대체	대체
A	4
E	3
G	6
I	1
O	0
S	5
Z	2문자열이 입력 되기 때문에, 이것을 Leet로 변환 하 여 출력 하는 프로그램을 작성할 수 있습니다.
*/

package C;

import java.util.Scanner;

public class C016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        s = s.replace("A", "4");
        s = s.replace("E", "3");
        s = s.replace("G", "6");
        s = s.replace("I", "1");
        s = s.replace("O", "0");
        s = s.replace("S", "5");
        s = s.replace("Z", "2");

        System.out.println(s);
    }
}
