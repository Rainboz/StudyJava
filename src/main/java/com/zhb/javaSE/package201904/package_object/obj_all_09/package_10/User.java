package com.zhb.javaSE.package201904.package_object.obj_all_09.package_10;


import java.util.Arrays;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-24 18:07
 **/
public class User extends MyArrays {
    int[] a = new int[2];
    int[] b = {1,2,3};
    int[] c = {1};
    public User(int[] a) {
        this.a = a;
    }

    @Override
    int get(int index) {
        //根据索引，获得元数的值
        return a[index];
    }

    @Override
    int size() {
        //获得动态数组中元素的个数；
        return a.length;
    }

    @Override
    int[] add(int value) {
        //追加一个值
        System.arraycopy(a,0,b,0,a.length);
        b[a.length] = value;
        return b;
    }

    @Override
    void remove1(int index) {
        //根据索引，删除一个值

    }

    @Override
    int[] add(int position, int value) {
        //在指定位置插入一个数值
        if (position < 0 || position >a.length){
            System.out.println("非法插入");
        }else {
            System.out.println("插入值value：");
            //主要
            for (int i = 0; i < b.length - 1; i++) {
                //a[n]插入值100，从后面开始移
                //a[index] = value;
                // a[index+i] = a[index];
                if (i < position) {
                    b[i] = a[i];
                } else if (i == position) {
                    b[i] = value;
                } else {
                    b[i] = a[i - 1];
                }
            }
        }
        return b;
    }

    @Override
    void set(int position, int value) {
        //修改某个位置的数值
        Arrays.fill(a,position,position+1,value);
    }
    // 移除数组指定下标的元素 重载+1
    public int[] remove(int[] array,int index){
        return (int[]) remove((Object) array, index);
    }

    // 移除数组指定下标的元素 重载+2
    public Object remove(Object array,int index){

        int length = java.lang.reflect.Array.getLength(array);
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length);
        }

        Object result=java.lang.reflect.Array.newInstance(array.getClass().getComponentType(),length-1);
        // 截取被删除的前半部分
        System.arraycopy(array, 0, result, 0, index);

        if (index < length - 1) {
            // 截取被删除的后半部分
            System.arraycopy(array, index + 1, result, index, length - index - 1);
        }

        return result;
    }
}
