package Game.method;

import Game.bo.Logon;
import Game.bo.PlayAccount;
import Game.entity.User;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class GetInformation {
    private List<User> Players = new ArrayList<>();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer detection = 0;

    @Override
    public String toString() {
        return "GetInformation{" +
                "Players=" + Players +
                '}';
    }

    private Integer signIn;

    public List<User> getPlayers() {
        return Players;
    }

    public void Informations() throws IOException {
        PlayAccount playAccount = new PlayAccount();
        if (!playAccount.getF().exists()) {
            playAccount.accountSet(getPlayers());
        } else {
            playAccount.readAccount(getPlayers());
        }
        /*
        Gson gson = new Gson();
        String s = gson.toJson(Players);
        File f = new File("C:/Users/Administrator/Desktop/Gamer/src/main/resources/Players.json");
        f.createNewFile();
        byte[] biff =  s.getBytes();
        RandomAccessFile randomAccessFile = new RandomAccessFile(f,"rws");
        randomAccessFile.write(biff);*/
    }

    public void register(String accont, String password, String name) throws IOException {
        User user = new User(accont, password, name);
        if (this.detection == 0) {
            if (Players.size() == 0) {
                Players.add(user);//第一个人注册
                System.out.println("注册成功");
                logon(accont, password);
            } else {
                for (User player : Players) {
                    if (player.getAccont().equals(accont)) {
                        System.out.println("该账号已被注册");
                        detection = 1;
                        break;//判断账号存在
                    }
                }
                if (detection == 0) {
                    Players.add(user);//将新账户加入数据库
                    System.out.println("注册成功");
                    logon(accont, password);
                } else if (detection == 1) {
                    detection = 0;

                }
            }
        }

    }

    public void logon(String account, String password) throws IOException {
        PlayAccount playAccount = new PlayAccount();
        for (int i = 0; i < playAccount.checkAccount().size(); i++) {
            if (playAccount.checkAccount().size() - 1 == i) {
                if (account.equals(playAccount.checkAccount().get(i).getAccont())) {
                    if (password.equals(playAccount.checkAccount().get(i).getPassword())) {
                        signIn = 1;
                        System.out.println("用户:" + playAccount.checkAccount().get(i).getName() + "的金币为" + playAccount.checkAccount().get(i).getGolden());
                    } else {
                        System.out.println("密码错误");
                    }
                    break;
                } else {
                    System.out.println("请输入正确的用户名");
                }
            } else {
                if (account.equals(playAccount.checkAccount().get(i).getAccont())) {
                    if (password.equals(playAccount.checkAccount().get(i).getPassword())) {
                        this.name = playAccount.checkAccount().get(i).getName();
                        System.out.println("用户:" + playAccount.checkAccount().get(i).getName() + "的金币为" + playAccount.checkAccount().get(i).getGolden());
                    } else {
                        System.out.println("密码错误");
                    }
                    break;
                }
            }
        }

    }


    List<LocalDate> dates = new ArrayList<>();
    private Integer count = 0;

    public Integer getCount() {
        return count;
    }
//    private Map<String,Date> map = new HashMap<>();

    public boolean SignIn() {
        LocalDate today = LocalDate.now();
        if (dates.contains(today)) {
            System.out.println("今天已经签到过了");
            return false;
        } else {
            dates.add(today);
            System.out.println("签到成功");
            return true;
        }
    }

    public void SignInCount() {
        for (int i = 0; i < dates.size(); i++) {
            if (count == 0 && i == dates.size() - 1) {
                count++;
                System.out.println("连续签到" + count + "天");
            } else if (count == 0 && i < dates.size() - 1) {
                count = 1;
            } else if (dates.get(i).equals(dates.get(i - 1).plusDays(1))) {
                if (i == dates.size() - 1) {
                    count++;
                    System.out.println("连续签到" + count + "天");
                } else {
                    count++;
                }
            } else {
                count = 1;
            }
        }
    }

    private Integer i = 0;//获取礼物的判断条件


    public int anInt() {
        if (getCount() == 1) {
            return 1;
        } else if (getCount() == 15) {
            return 2;
        } else if (getCount() == 30) {
            return 3;
        } else {
            return 0;
        }
    }
}
