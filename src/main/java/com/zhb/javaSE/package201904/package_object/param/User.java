package com.zhb.javaSE.package201904.package_object.param;

/**
 * @program: StudyJava
 * @description: s
 * @author: rainboz
 * @create: 2019-04-20 20:35
 **/
public class User {
    private String ID;
    private String passwrod;
    private String e_mail;

    public User(String ID, String passwrod, String e_mail) {
        this.ID = ID;
        this.passwrod = passwrod;
        this.e_mail = e_mail;
    }

    public User() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID='" + ID + '\'' +
                ", passwrod='" + passwrod + '\'' +
                ", e_mail='" + e_mail + '\'' +
                '}';
    }
}
