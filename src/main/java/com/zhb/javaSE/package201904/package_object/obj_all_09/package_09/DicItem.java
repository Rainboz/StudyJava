package com.zhb.javaSE.package201904.package_object.obj_all_09.package_09;

/**
 * @program: StudyJava
 * @description: 字典项类DicItem包括EngLish(英语单词)、Chinese(对应中文含义)数据成员，字典类包括一个字典项类的列表，包含Add()(添加单词)和trans(英汉翻译)成员函数。
 * @author: rainboz
 * @create: 2019-04-24 11:04
 **/
public class DicItem {
    private String engLish;
    private String chinese;

    public DicItem() {
    }

    public DicItem(String engLish, String chinese) {
        this.engLish = engLish;
        this.chinese = chinese;
    }

    public String getEngLish() {
        return engLish;
    }

    public void setEngLish(String engLish) {
        this.engLish = engLish;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return "DicItem{" +
                "engLish='" + engLish + '\'' +
                ", chinese='" + chinese + '\'' +
                '}';
    }
}
