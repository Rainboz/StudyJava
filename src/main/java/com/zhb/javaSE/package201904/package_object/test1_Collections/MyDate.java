package com.zhb.javaSE.package201904.package_object.test1_Collections;

import java.util.Comparator;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-23 11:09
 **/
public class MyDate implements Comparator<MyDate> {
    private int month;
    private int day;
    private int year;

    public MyDate() {
    }

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public  int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }


    @Override
    public int compare(MyDate o1, MyDate o2) {
        return o1.year - o1.year;//升序
    }
}
