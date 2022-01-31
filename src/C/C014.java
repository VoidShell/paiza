/* C014: 공이 들어가는 상자
반경 r의 좋아하는 공을 획득 했다 당신은 그것을 수납할 수 있는 상자를 찾고 있습니다.

지금 n 개의 상자가 있고 i (1 ≤ i ≤ n) 번째 상자는 높이 h_i 폭 w_i 깊이 d_i입니다. 각 상자에 대해 드릴링 직경, 가슴 높이, 폭, 깊이의 3 개 길이 중 가장 짧은 것 보다 낮으면, 무사에 볼을 수납 하실 수 있습니다.


입력 예 1의 그림
 */

package C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();	// 상자의 수
        int r = sc.nextInt();	// 공의 반지름

        List<Integer> h = new ArrayList<>();
        List<Integer> w = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            h.add(sc.nextInt());	// 높이
            w.add(sc.nextInt());	// 가로
            d.add(sc.nextInt());	// 세로
        }

        int min;
        for (int i = 0; i < n; i++) {
            if (h.get(i) <= w.get(i)) {
                min = h.get(i);
                if (d.get(i) <= min) {
                    min = d.get(i);
                    {
                        if (2 * r <= min) {
                            System.out.println(i + 1);
                        }
                    }
                } else if (2 * r <= min) {
                    System.out.println(i + 1);
                }
            } else {
                min = w.get(i);
                if (d.get(i) <= min) {
                    min = d.get(i);
                    {
                        if (2 * r <= min) {
                            System.out.println(i + 1);
                        }
                    }
                } else if (2 * r <= min) {
                    System.out.println(i + 1);
                }
            }
        }
    }
}