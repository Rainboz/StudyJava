package com.zhb.javaSE.package201904.package_object.obj_all_09.package_09;


import java.util.*;

/**
 * @program: StudyJava
 * @description: 设计一个词典类Dic，每个单词包括英文单词及对应的中文含义，并有一个英汉翻译成员函数，通过查词典的方式将一段英语翻译成对应的汉语。
 * @author: rainboz
 * @create: 2019-04-24 11:01
 **/
public class Dic {
    private Map<String, String> map;
//list{[1,[e,c]]}

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Map<String, String> add(DicItem dicItem) {
        /**
         *功能描述 @description: TODO 添加单词
         * @date 19-4-24 上午11:25
         * @param []
         * @return void
         */
        map.put(dicItem.getEngLish(), dicItem.getChinese());
        return map;
    }

    public void trans(String in, Map<String, String> map) {
        /**
         *功能描述 @description: TODO 英汉翻译
         * @date 19-4-24 上午11:25
         * @param []
         * @return void
         */
//        Properties pps = new Properties();
//        pps.getProperty()
        String[] a = in.split(" ");
        for (String x : a) {
             //System.out.println("单词："+x);
        }
        for (String key : map.keySet()) {
            String value = map.get(key);
            //System.out.println(key+"  "+value);
            if (a[0].equals(key)) {
                //System.out.println("get方法："+dicItem.getChinese());
                System.out.println("map.get方法: " + map.get(a[0]));
                System.out.println("输入：" + in);
                System.out.println("value: " + map.get(a[0]));
            }
        }
        System.out.println("key数组:" + map.keySet());
        System.out.println("输入的查看是否存在key中：" + map.containsKey(a[0]));
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(Arrays.toString(a));//输入得到的分割字符串数组
        /**
         * 输入样例：
         * 1.a.xv.asasa.fwfr.sdf.sd.zhi.aas.peng.asdasdas.you.asdasd.love.asdwq.zhong.ada.guo.as.d.ma.asd.?
         * 2.xv.zhi.peng.you.love.i.ma.?.zhang.zhong.guo.love.you.!.ha.ha.ha..fuck.fuck.fuck.fuck
         */
        for (int i = 0; i < a.length; i++) {
            if (map.get(a[i])== null)
                System.out.print("");
            else
                stringBuffer.append(map.get(a[i]));
           // System.out.println(map.get(a[i]));
            /*if (map.get(a[i]).)) {
            } else {
                stringBuffer.append(map.get(a[i]));
            }*/
        }
        System.out.println("英译中：" + stringBuffer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> map = new HashMap<String, String>();

        Dic dic = new Dic();
        dic.setMap(map);
        dic.add(new DicItem("love", "爱"));
        dic.add(new DicItem("i", "我"));
        dic.add(new DicItem("you", "你"));
        dic.add(new DicItem("I", "我"));
        dic.add(new DicItem("LOVE", "爱"));
        dic.add(new DicItem("YOU", "你"));
        dic.add(new DicItem("zhang", "张"));
        dic.add(new DicItem("zhong", "中"));
        dic.add(new DicItem("guo", "国"));
        dic.add(new DicItem("xv", "徐"));
        dic.add(new DicItem("zhi", "子"));
        dic.add(new DicItem("peng", "鹏"));
        dic.add(new DicItem("ma", "吗"));
        dic.add(new DicItem("?", "?"));
        dic.add(new DicItem("ha", "哈"));
        dic.add(new DicItem("fuck", "艹"));
        dic.add(new DicItem(",", "，"));
        dic.add(new DicItem(".", "。"));
        dic.add(new DicItem("!", "！"));
        Set<Map.Entry<String, String>> entry = dic.getMap().entrySet();
        for (Map.Entry<String, String> en : entry) {
            //System.out.println(en);//遍历map
        }
        System.out.println("输入需要翻译的英文：");
        String s = sc.next();
        dic.trans(s, dic.getMap());


    }
}
