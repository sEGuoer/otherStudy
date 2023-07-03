package Game.bo;


import Game.entity.User;
import Game.sevice.imp.PlayerServiceImpl;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class PlayAccount {
    public File getF() {
        return f;
    }

    File f = new File("C:/Users/Administrator/Desktop/Gamer/src/main/resources/Players.json");
    Gson gson = new Gson();

    public void accountSet(List<User> Players) throws IOException {
            String s = gson.toJson(Players);
            f.createNewFile();
            byte[] biff = s.getBytes();
            RandomAccessFile randomAccessFile = new RandomAccessFile(f, "rws");
            randomAccessFile.write(biff);


    }
    public List<User> checkAccount() throws IOException {
        JSONArray jsonArray = JSONUtil.readJSONArray(f, StandardCharsets.UTF_8);
        List<User> users = new ArrayList<>();
        for (Object object : jsonArray) {
            JSONObject playerJson = (JSONObject) object;
            User user = playerJson.toBean(User.class);
            users.add(user);
        }return users;

        /*InputStream inputStream = new FileInputStream(f);
        byte[] input = new byte[(int) f.length()];
        inputStream.read(input);
        String s1 = new String(input);
        List s = gson.fromJson(s1, List.class);
        return s;*/
    }

    public void readAccount(List<User> Players) throws IOException {

        InputStream inputStream = new FileInputStream(f);
        byte[] input = new byte[(int) f.length()];
        inputStream.read(input);
        String s1 = new String(input);
        List s = gson.fromJson(s1, List.class);
        if (s.equals(Players) ) {
        } else {
            for (int i = s.size(); i < Players.size(); i++) {
                s.add(Players.get(i));
            }
            String M = gson.toJson(s);
            f.createNewFile();
            byte[] biff = M.getBytes();
            RandomAccessFile randomAccessFile = new RandomAccessFile(f, "rws");
            randomAccessFile.write(biff);
        }
    }
}
