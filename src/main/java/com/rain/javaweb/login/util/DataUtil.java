package com.rain.javaweb.login.util;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-08-23 上午11:41
 */
public class DataUtil {
    public static String[] telFirst = "134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");
    private static final String[] email_suffix = ("@gmail.com,@yahoo.com,@msn.com,@hotmail.com,@aol.com,@ask.com,@live.com,@qq.com,@0355.net," +
            "@163.com,@163.net,@263.net,@3721.net,@yeah.net,@googlemail.com,@126.com,@sina.com,@sohu.com,@yahoo.com.cn").split(",");
    public static String base = "abcdefghijklmnopqrstuvwxyz0123456789";
    /**
     * @param digit 位数
     * @return 随机生成digit位数的数字
     */
    public static long getNum(int digit) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < digit; i++) {
            if (i == 0 && digit > 1)
                str.append(new Random().nextInt(9) + 1);
            else
                str.append(new Random().nextInt(10));
        }
        return Long.valueOf(str.toString());
    }

    //自动生成名字（中文）
    public static String getRandomJianHan(int len) {
        String ret = "";
        for (int i = 0; i < len; i++) {
            String str = null;
            int hightPos, lowPos; // 定义高低位
            Random random = new Random();
            hightPos = (176 + Math.abs(random.nextInt(39))); // 获取高位值
            lowPos = (161 + Math.abs(random.nextInt(93))); // 获取低位值
            byte[] b = new byte[2];
            b[0] = (new Integer(hightPos).byteValue());
            b[1] = (new Integer(lowPos).byteValue());
            try {
                str = new String(b, "GBK"); // 转成中文
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
            ret += str;
        }
        return ret;
    }

    //生成随机用户名，数字和字母组成,
    public static String getStringRandom(int length) {

        String val = "";
        Random random = new Random();

        //参数length，表示生成几位随机数
        for (int i = 0; i < length; i++) {

            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            //输出字母还是数字
            if ("char".equalsIgnoreCase(charOrNum)) {
                //输出是大写字母还是小写字母
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char) (random.nextInt(26) + temp);
            } else if ("num".equalsIgnoreCase(charOrNum)) {
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }

    public static String getSex() {
        String[] str = {"男", "女"};
        Random random = new Random();
        int i = random.nextInt(str.length);
        return str[i];
    }

    public static int getNum2(int start, int end) {
        return (int) (Math.random() * (end - start + 1) + start);
    }

    /**
     * 返回手机号码
     */

    public static String getTel() {
        int index = getNum2(0, telFirst.length - 1);
        String first = telFirst[index];
        String second = String.valueOf(getNum2(1, 888) + 10000).substring(1);
        String third = String.valueOf(getNum2(1, 9100) + 10000).substring(1);
        return first + second + third;
    }

    /**
     * 返回Email
     *
     * @param lMin 最小长度
     * @param lMax 最大长度
     * @return
     */
    public static String getEmail(int lMin, int lMax) {
        int length = getNum2(lMin, lMax);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = (int) (Math.random() * base.length());
            sb.append(base.charAt(number));
        }
        sb.append(email_suffix[(int) (Math.random() * email_suffix.length)]);
        return sb.toString();
    }

    public static void main(String[] args) {
        long num = getNum(8);
        String randomJianHan = getRandomJianHan(3);
        String stringRandom = getStringRandom(3);

        System.out.println(randomJianHan);
        System.out.println(stringRandom);
        System.out.println(num);


        String sex = getSex();
        System.out.println(sex);

        String tel = getTel();
        System.out.println(tel);

        String email = getEmail(15, 20);
        System.out.println(email);

    }
}
