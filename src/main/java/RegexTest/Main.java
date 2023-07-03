package RegexTest;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*Main main = new Main();
        main.run("12311-1234567");

        Pattern p = Pattern.compile("(\\d{2})\\:(\\d{2})\\:(\\d{2})");
        Matcher m = p.matcher("23:01:59");
        if (m.matches()) {
            String g1 = m.group(1);
            String g2 = m.group(2);
            String g3 = m.group(3);
            System.out.println(g1);
            System.out.println(g2);
            System.out.println(g3);
        } else {
            System.out.println("匹配失败!");
        }*/
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("name", "Bob");
        stringStringMap.put("lang", "Java");
        String s = "Hello, ${name}! You are learning ${lang}!";
        Pattern p = Pattern.compile("(\\$\\{\\w{4}\\})\\! You are learning (\\$\\{\\w{4}\\})");
        Matcher m = p.matcher(s);
        while (m.find()){
            String g1 = m.group(1);
            String gg1 = g1.replaceAll("\\$","");
            gg1 = gg1.replaceAll("\\{","");
            gg1 = gg1.replaceAll("\\}","");
            System.out.println(gg1);
            String g2 = m.group(2);
            String gg2 = g2.replaceAll("\\$","");
            gg2 = gg2.replaceAll("\\{","");
            gg2 = gg2.replaceAll("\\}","");
            System.out.println(gg2);
            String a =s.replace(g1,stringStringMap.get(gg1));
            String b = a.replace(g2,stringStringMap.get(gg2)); 
            System.out.println(b);
        }
    }

    public void run(String a){
        String s = "\\d{3,4}-\\d{7,8}";
        Boolean b = a.matches(s);
        if (b == false){
            System.out.println("错误");
        }else {
            System.out.println("正确");
        }
    }
}

