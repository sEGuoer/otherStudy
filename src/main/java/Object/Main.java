package Object;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }




    public void walkspeed(String name, int i) {
        System.out.println(name + "行走速度为" + i);
    }

    public void attackpower(String name, int i) {
        System.out.println(name + "攻击力为" + i);
    }

    public void run() {
        Gamer gamer = new Gamer();
        NPC npc = new NPC();
        Monster monster = new Monster();
        walkspeed("玩家",gamer.walk());
        walkspeed("小兵",npc.walk());
        walkspeed("怪物",monster.walk());
        attackpower("玩家",gamer.attack());
        attackpower("小兵",npc.attack());
        attackpower("怪物",monster.attack());
        gamer.dead("玩家");
        npc.dead("小兵");
        monster.dead("怪物");
    }
}