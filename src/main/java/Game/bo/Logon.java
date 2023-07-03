package Game.bo;

import Game.entity.Gift;
import com.google.gson.Gson;

import java.io.*;
import java.util.Date;
import java.util.List;

public class Logon {
    File f = new File("C:/Users/Administrator/Desktop/Gamer/src/main/resources/Logon.json");
    Gson gson = new Gson();
    public void logonSet(List<Date> dates)  throws IOException {

        String s = gson.toJson(dates);
        f.createNewFile();
        byte[] biff =  s.getBytes();
        RandomAccessFile randomAccessFile = new RandomAccessFile(f,"rws");
        randomAccessFile.write(biff);
    }


    public List readLogon(List<Date> dates) throws IOException {
        InputStream inputStream = new FileInputStream(f);
        byte[] input = new byte[(int) f.length()];
        inputStream.read(input);
        String s1 = new String(input);
        List s = gson.fromJson(s1, List.class);
        if (s.equals(dates) ) {
        } else {
            for (int i = s.size(); i < dates.size(); i++) {
                s.add(dates.get(i));
            }
            String M = gson.toJson(s);
            f.createNewFile();
            byte[] biff = M.getBytes();
            RandomAccessFile randomAccessFile = new RandomAccessFile(f, "rws");
            randomAccessFile.write(biff);
        }
        return s;
    }
}
