/* C031: 시차를 구하려는
당신은 세계 확장을 목표로 SNS "paizabook"을 개발 하 고 있는 엔지니어입니다.
Paizabook에서는 친구가 올린 일기 등을 볼 수 있지만, 사용자의 위치에 의해 표시 된다, 시간을 수정 해야 합니다.

예를 들면, 런던에서 사는 사용자가 현지 시간 8:30에 게시 하는 일기, 일본에 살고 있는 사용자 화면에서 17:30로 표시 되어야 합니다.
이것은 일본의 시계가 런던 시간 다만 9 시간 진행 하 고 있기 때문입니다. 게다가, 00:00에서 23:59까지 24 시간 형식으로 나타내는 것으로 합니다.

N 개 도시의 시차 정보 및 그들의 사이에서 몇몇 도시에 사는 사용자의 일기, 시간 (현지 시간)가 입력 되기 때문에
각각의 도시에 거주 하는 사용자의 화면에 표시 되는, 시간을 출력 하는 프로그램을 작성 하 여 주시기 바랍니다.
 */

package C;

import java.util.*;

public class C031 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 부분
        int cityCount = Integer.parseInt(sc.nextLine());
        List<String> inputCity = new ArrayList<>();
        List<Integer> inputTime = new ArrayList<>();
        // nextLine으로 받은 데이터를 공백을 구분자로 split해 List에 각각 저장
        for(int i = 0; i < cityCount; i++) {
            String[] input = sc.nextLine().split(" ");
            inputCity.add(input[0]);
            inputTime.add(Integer.parseInt(input[1]));
        }
        // 글을 게시한 유저의 도시 이름과 시간 데이터를 split으로 쪼개 str에 저장
        String[] str = sc.nextLine().trim().split(" ");
        // str[0]에 저장된 도시 이름을 postUserCityName에 저장
        String postUserCityName = str[0];
        String strLocalTime = str[1];

        // inputCity data에서 postUserCityName과 같은 이름 찾기
        int indexEqualCity = 0;
        for(int i = 0; i < cityCount; i++) {
            if(postUserCityName.equals(inputCity.get(i))) {
                indexEqualCity = i;
            }
        }

        int hourUTC = Integer.parseInt(strLocalTime.substring(0, 2))
                - inputTime.get(indexEqualCity);
        List<Integer> standardHour = new ArrayList<>();
        for(int i = 0; i < cityCount; i++) {
            // 합이 24 이면 1일을 올리고 나머지를 가져온다.
            if(inputTime.get(i) + hourUTC >= 24) {
                standardHour.add((inputTime.get(i) + hourUTC) % 24);
            } else if(inputTime.get(i) + hourUTC < 0) {
                standardHour.add(24 + inputTime.get(i) + hourUTC);
            } else {
                standardHour.add(inputTime.get(i) + hourUTC);
            }
        }
        for(int i = 0; i < cityCount; i++) {
            if(standardHour.get(i) < 10) {
                System.out.print("0" + standardHour.get(i));
            } else {
                System.out.print(standardHour.get(i));
            }
            System.out.println(strLocalTime.substring(2));
        }
    }

}
