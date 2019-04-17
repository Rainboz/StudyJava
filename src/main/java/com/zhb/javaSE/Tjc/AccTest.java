package com.zhb.javaSE.Tjc;

public class AccTest {
    public static void main(String[] args) {
        /**
         * 创建一个账号为1122、余额为20000、年利率4.5%的Account对象。使用withdraw方法提款30000元，并打印余额。
         * 再使用withdraw方法提款2500元，使用deposit方法存款3000元，然后打印余额和月利率。
         */
        Account account = new Account(1122,2000,4.5);
    }
}
