package RegexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String s ="<!doctype html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n" +
                "<meta name=\"renderer\" content=\"webkit\">\n" +
                "<meta name=\"force-rendering\" content=\"webkit\">\n" +
                "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,Chrome=1\">\n" +
                "<meta name=\"applicable-device\" content=\"pc,mobile\">\n" +
                "<title>java截取字符串,java截取字符串中的一段_java笔记_设计学院</title>\n" +
                "<link rel=\"stylesheet\" href=\"https://www.python100.com/static/css/hui.css\">\n" +
                "<link rel=\"stylesheet\" href=\"https://www.python100.com/static/css/style.css\">\n" +
                "<script src=\"https://www.python100.com/zb_system/script/jquery-2.2.4.min.js?v=173060\"></script>\n" +
                "<script src=\"https://www.python100.com/static/js/jscroll.js\"></script>\n" +
                "<link rel=\"canonical\" href=\"https://www.python100.com/html/34522.html\"/>\n" +
                "<link rel=\"stylesheet\" href=\"https://www.python100.com/highlight/prism.css\">\n" +
                "<script src=\"https://www.python100.com/highlight/prism.js\"></script>\n" +
                "<script>\n" +
                "var _hmt = _hmt || [];\n" +
                "(function() {\n" +
                "  var hm = document.createElement(\"script\");\n" +
                "  hm.src = \"https://hm.baidu.com/hm.js?a49778e5b135106a4771f91c0fd2dabc\";\n" +
                "  var s = document.getElementsByTagName(\"script\")[0]; \n" +
                "  s.parentNode.insertBefore(hm, s);\n" +
                "})();\n" +
                "</script>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"header\">\n" +
                "    <div class=\"hui-container hui-clear\">\n" +
                "        <div class=\"logo\"><a href=\"https://www.python100.com/\"><img src=\"https://www.python100.com/wp-content/uploads/2020/04/sjlogo.png\" /></a></div>\n" +
                "        <div class=\"search\">\n" +
                "            <form class=\"hui-clear\" name=\"search\" method=\"post\" action=\"https://www.python100.com/zb_system/cmd.php?act=search\">\n" +
                "                <input type=\"text\" class=\"hui-input\" name=\"q\" placeholder=\"请输入关键字搜索\" />\n" +
                "                <button type=\"submit\"><i class=\"iconfont huiicon-sousuo\"></i></button>\n" +
                "            </form>\n" +
                "        </div>\n" +
                "        <div class=\"menu\">\n" +
                "            <ul>\n" +
                "                <li class=\"navbar-item\"><a href=\"https://www.python100.com/\" title=\"\">首页</a></li>            </ul>\n" +
                "        </div>\n" +
                "        <div class=\"menu-icon\"><i class=\"iconfont huiicon-caidan\"></i>目录</div>\n" +
                "        <div class=\"search-icon\"><i class=\"iconfont huiicon-sousuo\"></i></div>\n" +
                "    </div>\n" +
                "</div><div class=\"main-box\">\n" +
                "    <div class=\"hui-container hui-clear\">\n" +
                "        <div class=\"main-menu list-main-menu\">\n" +
                "    <div class=\"nicescroll\">\n" +
                "                                        <h3 class=\"main-menu-title\"><i class=\"iconfont huiicon-book\"></i>java笔记</h3>\n" +
                "            <dl class=\"list-menu\">\n" +
                "                                                <dd><a href=\"https://www.python100.com/html/66305.html\"><i></i>Java语法：变量命名规则</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55535.html\"><i></i>Java中List如何转换为数组</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55534.html\"><i></i>Java ArrayList方法指南</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55533.html\"><i></i>Java编程基础入门教程</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55532.html\"><i></i>Java循环遍历List</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55531.html\"><i></i>Java工程师必备：理解compareToIgnoreCase方法的使用</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55530.html\"><i></i>Java中的.equals方法</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55529.html\"><i></i>Java时间格式化</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55528.html\"><i></i>Java中抽象类与接口的区别</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55527.html\"><i></i>Java基础代码示例</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55526.html\"><i></i>Java中的函数使用</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55525.html\"><i></i>使用HashMap的remove方法</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55524.html\"><i></i>使用Java的Array.sort方法进行数组排序</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55523.html\"><i></i>Java对象复制</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55522.html\"><i></i>Java数组输入方法</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55521.html\"><i></i>Java数组拷贝操作详解</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55520.html\"><i></i>以Java字符串分割Split为中心的相关知识点</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55519.html\"><i></i>Java实现文件操作</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55518.html\"><i></i>如何查看Java版本</a></dd>\n" +
                "                                <dd><a href=\"https://www.python100.com/html/55517.html\"><i></i>Java Map循环指南</a></dd>\n" +
                "                            </dl>\n" +
                "                        </div>\n" +
                "</div>                    \n" +
                "<div class=\"main-center\">\n" +
                "<div class=\"dangqian\">\n" +
                "<a href='https://www.python100.com/'>首页</a>&nbsp;> <a href=\"https://www.python100.com/javanote/\" >java笔记</a> > java截取字符串,java截取字符串中的一段            </div>\n" +
                "    <div class=\"main-body\">\n" +
                "        <div class=\"pd20\">\n" +
                "            <div class=\"content-title\">\n" +
                "                <h1>java截取字符串,java截取字符串中的一段</h1>\n" +
                "                <span class=\"date\">更新：<time datetime=\"2022-12-01 02:52\">2022-12-01 02:52</time></span>\n" +
                "            </div>\n" +
                "                        <div class=\"content-body\">\n" +
                "                <h2 id=\"title-1\">本文目录一览：</h2><ul><li style='margin-bottom: 3px;list-style: none'>\n" +
                "1、<a href='#java中如何截取字符串中的指定一部分' title='java中如何截取字符串中的指定一部分'>java中如何截取字符串中的指定一部分</a>\n" +
                "</li>\n" +
                "<li style='margin-bottom: 3px;list-style: none'>\n" +
                "2、<a href='#java截取字符串？' title='java截取字符串？'>java截取字符串？</a>\n" +
                "</li>\n" +
                "<li style='margin-bottom: 3px;list-style: none'>\n" +
                "3、<a href='#Java如何截取字符串？' title='Java如何截取字符串？'>Java如何截取字符串？</a>\n" +
                "</li>\n" +
                "<li style='margin-bottom: 3px;list-style: none'>\n" +
                "4、<a href='#java截取字符串不同的几种方式' title='java截取字符串不同的几种方式'>java截取字符串不同的几种方式</a>\n" +
                "</li>\n" +
                "<li style='margin-bottom: 3px;list-style: none'>\n" +
                "5、<a href='#java截取指定字符串中的某段字符如何实现？' title='java截取指定字符串中的某段字符如何实现？'>java截取指定字符串中的某段字符如何实现？</a>\n" +
                "</li>\n" +
                "</ul><h2 id='java中如何截取字符串中的指定一部分' id=\"title-2\">java中如何截取字符串中的指定一部分</h2>\n" +
                "<p>java用substring函数截取string中一段字符串</p><p>在String中有两个substring()函数，如下：</p><p>一：String.substring(int start)</p><p>参数：</p><p>start：要截取位置的索引</p><p>返回：</p><p>从start开始到结束的字符串</p><p>例如：String str = \"hello word!\";         System.out.println(str.substring(1));</p><p>System.out.println(str.substring(3));</p><p>System.out.println(str.substring(6));</p><p>将得到结果为：</p><p>ello word!</p><p>lo word!</p><p>ord!</p><p>如果start大于字符串的长度将会抛出越界异常；</p><p>二：String.substring(int beginIndex, int endIndex)</p><p>参数：</p><p>beginIndex 开始位置索引</p><p>endIndex    结束位置索引</p><p>返回：</p><p>从beginIndex位置到endIndex位置内的字符串</p><p>例如：String str = \"hello word!\";</p><p>System.out.println(str.substring(1,4));</p><p>System.out.println(str.substring(3,5));</p><p>System.out.println(str.substring(0,4));</p><p>将得到结果为：</p><p>ell</p><p>lo</p><p>hell</p><p>如果startIndex和endIndex其中有越界的将会抛出越界异常。</p><h2 id='java截取字符串？' id=\"title-3\">java截取字符串？</h2>\n" +
                "<p>Java截取字符串的函数为xxxx.substring(x,y)，其中x为要取得的字符串的第一个字母在被截取字符串中的下标，y-x为要取得的字符串的长度。只要明白了这个原理，写起来就容易了。</p><p style=\"text-align: center\"><img src=\"https://www.python100.com/zb_users/upload/editor/water/2022-12-01/6387a70aef4ca.jpeg\" title=\"java截取字符串,java截取字符串中的一段\"><p><h2 id='Java如何截取字符串？' id=\"title-4\">Java如何截取字符串？</h2>\n" +
                "<p>这个是个JSON 字符串。使用json相关的库处理，比如Json-Path。</p><p>import com.jayway.jsonpath.JsonPath;</p><p>public class Main{</p><p>public static void main(String[] args) {</p><p>String json = \"{\\\"第一个数\\\":\\\"1\\\",\\\"第二个数\\\":\\\"2\\\"}\";</p><p>var number1 = JsonPath.read(json, \"$.第一个数\");</p><p>System.out.println(number1);</p><p>var number2 = JsonPath.read(json, \"$.第二个数\");</p><p>System.out.println(number2);</p><p>}</p><p>}</p><h2 id='java截取字符串不同的几种方式' id=\"title-5\">java截取字符串不同的几种方式</h2>\n" +
                "<p>1.split()+正则表达式来进行截取。将正则传入split()。返回的是一个字符串数组类型。不过通过这种方式截取会有很大的性能损耗，因为分析正则非常耗时。</p><p>String str = \"abc,12,3yy98,0\";</p><p>String[] strs=str.split(\",\");</p><p>for(int i=0,len=strs.length;ilen;i++){</p><p>  System.out.println(strs[i].toString());</p><p>}</p><p>运行结果：</p><p>abc</p><p>12</p><p>3yy98</p><p>2.通过subString()方法来进行字符串截取。subString通过不同的参数来提供不同的截取方式</p><p>2.1只传一个参数</p><p>例如：</p><p>String sb = \"bbbdsajjds\";</p><p>sb.substring(2);</p><p>将字符串从索引号为2开始截取，一直到字符串末尾。（索引值从0开始）；</p><p>2.2传入2个索引值</p><p>String sb = \"bbbdsajjds\";</p><p>sb.substring(2, 4);</p><p>从索引号2开始到索引好4结束（并且不包含索引4截取在内，也就是说实际截取的是2和3号字符）；</p><p>运行结果如下：</p><p>bdsajjds</p><p>bd</p><p>3.通过StringUtils提供的方法</p><p>StringUtils.substringBefore(“dskeabcee”, “e”);</p><p>/结果是：dsk/</p><p>这里是以第一个”e”，为标准。</p><p>StringUtils.substringBeforeLast(“dskeabcee”, “e”)</p><p>结果为：dskeabce</p><p>这里以最后一个“e”为准。</p><h2 id='java截取指定字符串中的某段字符如何实现？' id=\"title-6\">java截取指定字符串中的某段字符如何实现？</h2>\n" +
                "<p>如下图，给你贴出了代码段。可以利用字符串的substring函数来进行截取。</p><p>其中，substring函数有两个参数：</p><p>1、第一个参数是开始截取的字符位置。（从0开始）</p><p>2、第二个参数是结束字符的位置+1。（从0开始）</p><p>indexof函数的作用是查找该字符串中的某个字的位置，并且返回。</p><p>扩展资料：</p><p>substring这个函数也可以只写一个参数，就是起始字符位置。这样就会自动截取从开始到最后。</p><p>例如：</p><p>结果是：456789（注意：包括4。）</p><p>示例：</p><p>\"hamburger\".substring(3,8) returns \"burge\"</p><p>\"smiles\".substring(0,5) returns \"smile\"</p><p>参考资料：百度百科——substring</p>            </div>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <span id=\"Cache\" data-time=\"1686576864\"></span><!--Cache-->\n" +
                "<div class=\"footer\">\n" +
                "    <p><a href=\"https://beian.miit.gov.cn/\" ref=\"nofollow\">苏ICP备2023018380号-1</a> Copyright www.python100.com .Some Rights Reserved.</p>\n" +
                "</div></div>\n" +
                "\n" +
                "<div class=\"main-mulu\">\n" +
                "    <dl>\n" +
                "        <dt>文章目录</dt>\n" +
                "                <dd><a href=\"#title-1\">本文目录一览：</a></dd>\n" +
                "                <dd><a href=\"#title-2\">java中如何截取字符串中的指定一部分</a></dd>\n" +
                "                <dd><a href=\"#title-3\">java截取字符串？</a></dd>\n" +
                "                <dd><a href=\"#title-4\">Java如何截取字符串？</a></dd>\n" +
                "                <dd><a href=\"#title-5\">java截取字符串不同的几种方式</a></dd>\n" +
                "                <dd><a href=\"#title-6\">java截取指定字符串中的某段字符如何实现？</a></dd>\n" +
                "            </dl>\n" +
                "</div>\n" +
                "            </div>\n" +
                "</div>\n" +
                "<div class=\"wap-bg\"></div>\n" +
                "<a href=\"javascript:;\" class=\"gototop\"><i class=\"iconfont huiicon-xiangyou\"></i>顶部</a>\n" +
                "<script src=\"https://www.python100.com/static/js/main.js?v=1\" type=\"text/javascript\"></script>\n" +
                "<span id=\"Cache\" data-time=\"1686576864\"></span><!--Cache-->\n" +
                "</body>\n" +
                "</html><!--Cache SUCCESS-2023-06-12 21:34:24cache -->";
        Pattern p = Pattern.compile("\\w+?\\.html");
        Matcher m = p.matcher(s);
        while (m.find()) {
            String sub = s.substring(m.start(), m.end());
            System.out.println(sub);
        }
    }
}
