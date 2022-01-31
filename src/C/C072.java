/* C072: 괴물의 진화
귀하의 육성 괴물은 나날이 발전 하 고 있습니다. 괴물은 성장과 발전을 합니다.
괴물이 괴물로 진화 하는 공격력, 방어력, 민첩성의 세 가지 매개 변수에 따라 달라 집니다.
이 때 괴물의 매개에 의해 진화 조건을 만족 하는 괴물이 존재할 경우와 존재 하지 않을 수 있습니다.

괴물 및 각 진화 된 괴물 괴물 이름 진화 조건 부여 되기 때문에, 발전 조건에 맞는 몬스터 이름을 모두 출력 합니다.
진화 조건을 みたす 괴물이 없으면 "no evolution"을 출력 합니다.

예로 다음과 같은 괴물의 매개로 발전 된 각 괴물의 능력의 조건이 주어 지는 경우를 가정해 봅니다.
이 경우 공격력과 방어력은 paizabird와 paizasheep로 진화 조건을 만족 시키고 민첩성에서는 paizasheep로 진화 조건을 만족 시키기 때문에, 진화 된 괴물의 이름은 paizasheep 중 하나입니다.
 */

package C;

import java.util.Scanner;

public class C072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ATK = sc.nextInt();
        int DEF = sc.nextInt();
        int AGI = sc.nextInt();

        int N = sc.nextInt();

        Monster[] monster = new Monster[N];

        int evolution = 0;
        for (int i = 0; i < N; i++) {
            monster[i] = new Monster(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
                    sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < N; i++) {
            if (monster[i].getMinATK() <= ATK && monster[i].getMaxATK() >= ATK) {
                if (monster[i].getMinDEF() <= DEF && monster[i].getMaxDEF() >= DEF) {
                    if (monster[i].getMinAGI() <= AGI && monster[i].getMaxAGI() >= AGI) {
                        System.out.println(monster[i].getName());
                        evolution++;
                    }
                }
            }
        }
        if (evolution == 0) {
            System.out.println("no evolution");
        }
    }
}

class Monster {
    private String name = null;
    private int minATK = 0;
    private int maxATK = 0;
    private int minDEF = 0;
    private int maxDEF = 0;
    private int minAGI = 0;
    private int maxAGI = 0;

    public Monster(String name, int minATK, int maxATK, int minDEF, int maxDEF, int minAGI, int maxAGI) {
        this.name = name;
        this.minATK = minATK;
        this.maxATK = maxATK;
        this.minDEF = minDEF;
        this.maxDEF = maxDEF;
        this.minAGI = minAGI;
        this.maxAGI = maxAGI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinATK() {
        return minATK;
    }

    public void setMinATK(int minATK) {
        this.minATK = minATK;
    }

    public int getMaxATK() {
        return maxATK;
    }

    public void setMaxATK(int maxATK) {
        this.maxATK = maxATK;
    }

    public int getMinDEF() {
        return minDEF;
    }

    public void setMinDEF(int minDEF) {
        this.minDEF = minDEF;
    }

    public int getMaxDEF() {
        return maxDEF;
    }

    public void setMaxDEF(int maxDEF) {
        this.maxDEF = maxDEF;
    }

    public int getMinAGI() {
        return minAGI;
    }

    public void setMinAGI(int minAGI) {
        this.minAGI = minAGI;
    }

    public int getMaxAGI() {
        return maxAGI;
    }

    public void setMaxAGI(int maxAGI) {
        this.maxAGI = maxAGI;
    }
}