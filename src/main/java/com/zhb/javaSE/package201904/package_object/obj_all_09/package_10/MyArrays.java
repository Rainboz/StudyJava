package com.zhb.javaSE.package201904.package_object.obj_all_09.package_10;

/**
 * @program: StudyJava
 * @description: 自已封装一个动态数组类，可以根据用户传递的数据，动态的对数组的长度进行扩展；类名是:MyArray
 * @author: rainboz
 * @create: 2019-04-24 18:05
 **/
public abstract class MyArrays {
    abstract int get(int index); //根据索引，获得元数的值
    abstract int size();  //获得动态数组中元素的个数；
    abstract int[] add(int value);  //追加一个值
    abstract void remove1(int index);   //根据索引，删除一个值
    abstract int[] add(int position, int value); //在指定位置插入一个数值
    abstract void set(int position, int value); //修改某个位置的数值

}
