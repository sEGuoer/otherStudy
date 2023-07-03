package Game.method;

import Game.bo.Gifts;
import Game.entity.Gift;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class EveryGift {
    private List<Gift> everyGift = new ArrayList<>();


    public List<Gift> getEveryGift() {
        return everyGift;
    }

    public void setEveryGift() throws IOException {

        Gift gift1 = new Gift("礼包1",500,"礼包1内容");
        everyGift.add(gift1);
        Gift gift2 = new Gift("礼包2",1000,"礼包2内容");
        everyGift.add(gift2);
        Gift gift3 = new Gift("礼包3",2000,"礼包3内容");
        everyGift.add(gift3);
        Gift gift4 = new Gift("礼包4",4000,"礼包4内容");
        everyGift.add(gift4);
        Gifts gifts = new Gifts();
        gifts.giftSet(getEveryGift());
      /*  Gson gson = new Gson();
        String s = gson.toJson(everyGift);
        File f = new File("C:/Users/Administrator/Desktop/Gamer/src/main/resources/Gift.json");
        f.createNewFile();
        byte[] biff =  s.getBytes();
        RandomAccessFile randomAccessFile = new RandomAccessFile(f,"rws");
        randomAccessFile.write(biff);*/
    }
    public Gift getGift(Integer integer){
        System.out.println("得到礼包" + integer + 1);
        return everyGift.get(integer);
    }
}
