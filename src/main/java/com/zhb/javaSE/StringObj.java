package com.zhb.javaSE;

import java.io.StringReader;

public class StringObj {
    static int i;
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringReader stringReader = new StringReader("545");
        i = 10;
        String a = String.valueOf(i);
        System.out.println(stringBuffer.append(i));
        System.out.println(stringReader);
        System.out.println(a.hashCode());
    }
}
