/* C066: 금붕어 복 각
당신이 축제에 금붕어 복 각을 하기로 했습니다. 거기 상점에서는 튼튼한 값이 x의 표준화가 있습니다. 함부로 무게 w 금붕어를 훔쳐 때 튼튼한 값이 w 줄이고 내구 0이 된 순간 깨진 다. 포이가 손상 된 경우, 그 때 금붕어는 푸는 수 없습니다.

당신은 N 개의 점수를 차례로 사용 하 여 첫 번째 금붕어에서 M 번째까지 순서 대로 푸는 것에 했습니다. 모든이가 고장나까지 받아 수 있는 금붕어의 수를 반응 하는 프로그램을 만들어야 합니다.

입력 예 1에서 첫 번째 포 이동에 1 개의 눈을 떠 서 튼튼한 값이 5입니다. 2 개의 눈을 すくおう 때 내구 0이 되므로 함부로 깨집니다. 마찬가지로 두 번째 점수에 금붕어를 훔쳐, 최후에 다음 그림과 같이 4 마리의 금붕어를 푸는 수 있습니다.
 */
package C;

import java.util.ArrayList;
import java.util.Scanner;

public class C066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m_yu = scanner.nextInt(); // 생선 몇 마리
        int n_mang = scanner.nextInt(); // 뜰채? 몇 개
        int x_naegu = scanner.nextInt(); // 내구성
        int a = x_naegu;  // 내구성 회복을 위한 변수 초기화
        int jihui = n_mang; // 뜰채? 부서질 때 마다 1개 빼기 하기 위한 변수 초기화
        int count = 0;   // 몇 마리 잡았는지 카운트
        ArrayList<Integer> list = new ArrayList<>(); // 생선 마리수 만큼 무게 받기
        for (int i = 0; i < m_yu; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {  // 생선 마리수 만큼 반복
            if (jihui > 0 && x_naegu - list.get(i) <= 0) {
                jihui -= 1; // 생선 무게가 내구성을 초과해 뜰채 붕괴!
                x_naegu = a; // 새로운 뜰채로 교체
                i -= 1; // i번째 물고기를 다시 또 들어야 하니까 i -= 1
            } else if (jihui == 0 && x_naegu - list.get(i) <= 0) {
                break;  // 뜰채 빵 개에다가 내구성 초과면 스탑
            } else if (jihui > 0 && (x_naegu - list.get(i) > 0)) {
                x_naegu -= list.get(i); // 뜰채가 생선 무게 이겨내고 뜰채가 0개 이상 시 내구성에서 생선 무게 빼기
                count++; // 생선 1마리 겟
            }
        }
        System.out.println(count);
    }
}

