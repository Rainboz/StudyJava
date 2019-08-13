package com.zhb.LintCode.packaages_0813;

import java.util.Scanner;

/**
 * @progrom StudyJava
 * @Description TODO 1, 12, 123,...12345678910,1234567891011...。
 * <p>
 * 并且小Q对于能否被3整除这个性质很感兴趣。
 * <p>
 * 小Q现在希望你能帮他计算一下从数列的第l个到第r个(包含端点)有多少个数可以被3整除。
 * @Author rainboz
 * @Date 2019-08-13 下午11:10
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(f(2, 5));
//        f2(l, r);
//        System.out.println(divide(l,r));
    }

    //3-5 123,1234,12345
    //2-5 12,123,1234,12345
    public static int f(int l, int r) {
        int count = 0;
        String str = "";
        int num = 0;
        for (int i = 1; i <= r; i++) {
            if (i < l) {
                //区间外的自加得到数列后面的数
                str += i;
            }
            if (i >= l && i <= r) {
                str += i;
                //区间内对3进行整除，现将str转int
                num = Integer.parseInt(str);
                //System.out.println(num);
                if (num % 3 == 0) {
                    count++;
                }

            }
        }
        return count;
    }
    public static void f2(int l, int r){
        int count = 0;
        int num = 0;
        StringBuilder sbl = new StringBuilder("");
        StringBuilder sbr = new StringBuilder("");
        for (int i = 1; i <= r; i++) {
            if (i < l) {
               sbl.append(i);
            }
            if (i >= l) {
                sbr.append(i);
                //区间内对3进行整除，现将str转int
                num = Integer.parseInt(sbr.toString());
                System.out.println(num);
                if (num % 3 == 0) {
                    count++;
                }

            }
        }
        System.out.println(count);
    }
    public static int divide(int l,int r){
        int count = 0;
        int intl = 0;
        StringBuilder sbl = new StringBuilder("");
        StringBuilder sbr = new StringBuilder("");
        for(int i = 1; i <= r ; i++){//1-5
            if(i < l ){//1-L
                sbl.append(i);
                  System.out.println("l=="+sbl);
            }
            if(i >= l){
                sbr = sbl;
                sbr.append(i);
                intl = Integer.parseInt(sbr.toString());
                   System.out.println("r=="+intl);
                if(intl % 3 == 0 )
                    count ++ ;
            }
        }
        return count;
    }
}
