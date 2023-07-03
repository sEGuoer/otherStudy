package Game.bo;

import Game.entity.Gift;
import Game.entity.User;
import com.google.gson.Gson;

import java.io.*;
import java.util.List;

public class Gifts  {
    File f = new File("C:/Users/Administrator/Desktop/Gamer/src/main/resources/Gift.json");
    Gson gson = new Gson();
    public void giftSet(List<Gift> gifts)  throws IOException {

        String s = gson.toJson(gifts);
        f.createNewFile();
        byte[] biff =  s.getBytes();
        RandomAccessFile randomAccessFile = new RandomAccessFile(f,"rws");
        randomAccessFile.write(biff);

    }

    public void readGift(List<Gift> gifts) throws IOException {

        InputStream inputStream = new FileInputStream(f);
        byte[] input = new byte[(int) f.length()];
        inputStream.read(input);
        String s1 = new String(input);
        List s = gson.fromJson(s1, List.class);
        if (s.equals(gifts) ) {
        } else {
            for (int i = s.size(); i < gifts.size(); i++) {
                s.add(gifts.get(i));
            }
            String M = gson.toJson(s);
            f.createNewFile();
            byte[] biff = M.getBytes();
            RandomAccessFile randomAccessFile = new RandomAccessFile(f, "rws");
            randomAccessFile.write(biff);
        }
    }
}