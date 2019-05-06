package com.zhb.javaSE.package201904.package_object.duotai_test.duotai_test2;

/**
 * @program: StudyJava
 * @description: 定义一个测试类Test，编写equalsArea方法测试两个对象的面积是否相等
 * （注意方法的参数类型，利用动态绑定技术），编写displayGeometricObject方法显示对象的面积
 * @author: rainboz
 * @create: 19-4-22 下午6:21
 **/
public class Test {
    /**
     * @return void
     * @Description //TODO 测试两个对象的面积是否相等（注意方法的参数类型，利用动态绑定技术）
     * @Param []
     **/
    public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        if (g1.findArea() == g2.findArea()) {
            System.out.println("圆的面积: " + g1.findArea() + " 矩形的面积: " + g2.findArea() + " ==> 圆的面积等于矩形面积");
            return true;
        }
        System.out.println("圆的面积: " + g1.findArea() + " 矩形的面积: " + g2.findArea() + " ==> 面积不相等");
        return false;
    }

    /**
     * @return void
     * @Description //TODO 显示对象的面积
     * @Param []
     **/
    public String displayGeometricObject(GeometricObject g) {
        if (g instanceof Circle) {
            Circle s = (Circle) g;
//            System.out.println("圆的面积为：" + s.findArea() + " color: " + s.coclor + " weight: " + s.weight);
            return "圆的面积为：" + s.findArea() + " color: " + s.coclor + " weight: " + s.weight;
        }
        if (g instanceof MyRectangle) {
            MyRectangle s = (MyRectangle) g;
//            System.out.println("矩形的面积为：" + s.findArea() + " color: " + s.coclor + " weight: " + s.weight);
            return "矩形的面积为：" + s.findArea() + " color: " + s.coclor + " weight: " + s.weight;
        }
        return "00";
    }

    public static void main(String[] args) {
        Test t = new Test();
//        Circle circle = new Circle(1,"绿",1);
        GeometricObject g1 = new Circle(1, "黄", 1);
        GeometricObject g2 = new MyRectangle(1, Math.PI, "红", 2.0);
        t.equalsArea(g1, g2);
        System.out.println(t.displayGeometricObject(g1));
        System.out.println(t.displayGeometricObject(g2));
//        t.displayGeometricObject(circle);
        System.out.println();
        GeometricObject g3 = new Circle(3, "黄", 1);
        GeometricObject g4 = new MyRectangle(5, Math.PI, "红", 2.0);
        t.equalsArea(g3, g4);
        System.out.println(t.displayGeometricObject(g3));
        System.out.println(t.displayGeometricObject(g4));
    }
}

