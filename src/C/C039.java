/* C039: 고대의 수식
고고학자 이자 IT 엔지니어인 당신은 파이 더 유적의 발굴에 성공, 거기 수식 같은 것이 새겨져 있다는 것을 깨달았습니다.


図1

귀하는이 수식 표기법을 파이 더 표기법 이라고 명명 하 고 해독을 시도한 곳에, 다음 규칙을 찾아 냈습니다.


ㆍ 모든 수식이 두 개 이상의 정수의 덧셈 되고있다
/사용 하는 1부터 99까지 10 진법을 채택
/운영 하는 "<"의 수가 정수의 10 단위를 나타내며 연속적인 운영 하는 "/" (슬래시)의 수가 정수의 1 단위를 나타내는
"+" 기호가 더하기 기호를 나타내는

이 규칙을 바탕으로 파이 더 표기법으로 작성 한 수식을 해석 하 고 그 결과를 반환 하는 프로그램을 만들어야 합니다. 게다가 위의 규칙 해석 불가능 한 입력은 주어 지지 않습니다.

보기)


///+////
→ 3 + 4 = 7


//+//////
→ 2 + 6 = 8


다음 예제는 앞의 숫자를 입력 하는 경우를 보여 줍니다.


<///////+<<</+////
→ 17 + 31 + 4 = 52

 */

package C;

import java.util.*;

public class C039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String s = sc.next();

        String[] ss = sc.next().split("");

        ArrayList<String> sList = new ArrayList<>(Arrays.asList(ss));

//        for (int i = 0; i < s.length(); i++) {
//            sList.add(Character.toString(s.charAt(i)));
//        }

        int count10 = Collections.frequency(sList, "<");
        int count1 = Collections.frequency(sList, "/");
        System.out.print(10 * count10 + 1 * count1);
    }
}
