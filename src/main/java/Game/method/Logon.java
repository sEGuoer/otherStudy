package Game.method;

import Game.entity.Gift;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Logon {
    private List<Date> dates = new ArrayList<>();
    public void logon() throws IOException {
        Date date = new Date();
        Game.bo.Logon logon = new Game.bo.Logon();
        if (dates.isEmpty()){
            logon.logonSet(dates);
        }else {
            logon.readLogon(dates);
        }
    }
}
