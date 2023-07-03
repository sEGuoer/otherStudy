package Game;

import Game.method.EveryGift;
import Game.method.GetInformation;

import java.io.IOException;

public class Main {

    public  void run() throws IOException {
        GetInformation getInformation = new GetInformation();/*
        getInformation.register("sda","asd","asd");
        getInformation.register("123","asd","asd");
        getInformation.register("1234","asd","asd");
        getInformation.register("1234","asd","asd");*///测试注册不同情况的账号
       /* getInformation.Informations();*//*
        getInformation.register("1234","asd","asd");
        getInformation.register("1234","asd","asd");*//*
        getInformation.Informations();
        getInformation.register("1234t","asd","asd");*//*
        getInformation.Informations();
        System.out.println(getInformation);*/
        getInformation.logon("1234","asd");/*
        getInformation.Logon("1234","a23");
        getInformation.Logon("1233","a23");*///测试登陆各种状况
        getInformation.SignIn();//签到
        getInformation.SignInCount();//签到次数查询
        EveryGift everyGift = new EveryGift();
        everyGift.setEveryGift();

        if (getInformation.anInt() == 0){
            everyGift.getGift(getInformation.anInt());
        }
        else if (getInformation.anInt() > 0){
                everyGift.getGift(0);
                everyGift.getGift(getInformation.anInt());
            }


    }
}

