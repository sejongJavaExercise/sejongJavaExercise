package chapter7.practice.question13;

public class Question13 {
    public static void main(String[] args) {
        Npc npc1 = new Npc("철수", "[슬라임을 잡아줘!]", 0, 0);
        Monster slime1 = new Monster("슬라임", 20, 100, 100);
        Npc npc2 = (Npc) copy(npc1);
        Monster slime2 = (Monster) copy(slime1);
        npc1.print();
        npc2.print();
        slime1.print();
        slime2.print();
    }

    static Copyable copy(Copyable c){
        Copyable replica = null;
        if(c instanceof Npc){
            Npc gameNPC = (Npc) c;
            replica = new Npc(gameNPC.name, gameNPC.quest, gameNPC.x + 1, gameNPC.y);
        }
        else if(c instanceof Monster){
            Monster gameMonster = (Monster) c;
            replica = new Monster(gameMonster.name, gameMonster.attackPower, gameMonster.x + 1, gameMonster.y);
        }
        else{}
        return replica;
    }
}

interface Copyable{}
interface Printable{
    void print();
}

class Npc implements Copyable, Printable{
    String name;
    String quest;
    int x;
    int y;
    Npc(String name, String quest, int x, int y) {
        this.name = name;
        this.quest = quest;
        this.x = x;
        this.y = y;
    }
    public void print(){
        System.out.printf("이름 : %s, 퀘스트 : %s, 좌표 : (%d, %d)\n", name, quest, x, y);
    }
}

class Monster implements Copyable, Printable{
    String name;
    int attackPower;
    int x;
    int y;
    Monster(String name, int attackPower, int x, int y) {
        this.name = name;
        this.attackPower = attackPower;
        this.x = x;
        this.y = y;
    }
    public void print(){
        System.out.printf("이름 : %s, 공격력 : %d, 좌표 : (%d, %d)\n", name, attackPower, x, y);
    }
}
