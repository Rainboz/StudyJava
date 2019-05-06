package com.zhb.javaSE.package201904.package_object.obj_all_12.package_01;

/**
 * @program: StudyJava
 * @description: 具有属性：名称（title）、页数（pageNum）、种类（type）
 * 具有方法：detail，用来在控制台输出每本教材的名称、页数、种类
 * @author: rainboz
 * @create: 2019-04-25 10:51
 **/
public class Books {
    private String title;
    private int pageNum;
    private String type;

    public Books(String type) {
        this.type = "计算机";
    }

    public Books(String title, int pageNum, String type) {
        this.title = title;
        this.pageNum = pageNum;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", pageNum=" + pageNum +
                ", type='" + type + '\'' +
                '}';
    }
}
