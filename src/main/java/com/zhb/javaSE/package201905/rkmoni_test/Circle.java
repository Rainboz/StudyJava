package com.zhb.javaSE.package201905.rkmoni_test;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-05-23 21:34
 **/
public class Circle extends Shape{
    private int x,y,radius;

    public Circle(int x, int y, int radius,DrawCircle drawCircle) {
//        super();//父类需要无参构造函数

        super(drawCircle);
//        super.drawCircle = drawCircle;//父类没有无参构造函数时报错。
        /**
         * 解决办法：
         * 1.在第一行加super();此时父类需要无参构造函数，但是drawCircle没有被传入，
         *      虽然可以解决编译时错误，但是会造成运行时错误，调用时出现空指针异常
         * 2.在父类增肌无参构造函数，此时super();可加可不加,直接使用super.drawCircle = drawCircle;
         * 3.直接使用super(drawCircle);此时不管父类有没有无参构造函数都可行，也不会报错
         * 因为父类有有参构造函数，所以系统默认无参构造函数会消失
         * 使用super.drawCircle = drawCircle;父类需要无参构造函数
         * 父类没有无参构造函数使用第3种
         * 父类有无参构造函数第2种
         * 第2种基于第一种
         */
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawCircle.drawCircle(radius,x,y);
    }
}
