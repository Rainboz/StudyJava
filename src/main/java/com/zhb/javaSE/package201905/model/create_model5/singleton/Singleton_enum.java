package com.zhb.javaSE.package201905.model.create_model5.singleton;

public enum Singleton_enum {
    INSTANCE;
    public void whateverMethod() {
        System.out.println("enum");
    }

    public static void main(String[] args) {
        Singleton_enum s = Singleton_enum.INSTANCE;
        Singleton_enum s2 = Singleton_enum.INSTANCE;
        s2.whateverMethod();
        s.whateverMethod();
    }
}
