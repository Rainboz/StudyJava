package com.zhb.javaSE.package201904.package_object.obj_all_sala;

/**
 * @program: StudyJava
 * @description: private成员变量month, day, year； 	toDateString()方法返回日期对应的字符串：xxxx年xx月xx日
 * @author: rainboz
 * @create: 2019-04-24 23:09
 **/
public class MyDate {
    private int month, day, year;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toDateString() {
        /**
         *功能描述 @description: TODO 方法返回日期对应的字符串：xxxx年xx月xx日
         * @date 19-4-24 下午11:14
         * @param []
         * @return java.lang.String
         */
        return "MyDate[" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                ']';
    }
}
