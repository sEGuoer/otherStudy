package Object;

import Object.thread.Ieverybody;

public class Everybody implements Ieverybody {
    public void dead(String name){
        System.out.println(name + "死亡");

    }
    public Integer walk(){
        return 10;};
    public Integer attack(){
        return 20;};

}
