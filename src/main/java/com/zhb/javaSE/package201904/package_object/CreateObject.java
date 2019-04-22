package com.zhb.javaSE.package201904.package_object;

/**
 * @program: StudyJava
 * @description: 面向对象
 * @author: rainboz
 * @create: 2019-04-19 10:23
 **/

import java.lang.reflect.Constructor;

/**
 * 通过反射创建对象有两种方式：
 * 1、使用Class对象的newInstance()方法，这种方法实际上是使用默认的构造器起来创建该类的实例
 * <p>
 * 2、使用Class对象获取指定的Constructor对象，调用Constructor对象的newInstance()方法
 * 来获取来创建该Class的实例，这样可以根据参数类型来指定使用哪个构造器。
 */
public class CreateObject extends Object{
    /**
     * 创建Class对象的方式一：返回与带有给定字符串的类或接口相关联的Class对象
     * (forName():传入时只需要以字符串的方式传入即可)
     * 通过Class类的一个forName（String className)静态方法返回一个Class对象，
     * className必须是全路径名称；
     * Class.forName()有异常：ClassNotFoundException
     * 直接用字节码文件获取对应实例
     * 调用无参构造器 ，若是没有，则会报异常
     */
    public static void createobj1() throws Exception {
        Class classType = Class.forName("com.zhb.javaSE.package201904.package_object.Person");
        Object obj = classType.newInstance();
        System.out.println("使用反射机制创建出来的对象 是否是Person类的对象：" + (obj instanceof Person));
        Person person1 = null;
        person1 = (Person) obj;
        person1.setAge(544);
        person1.setName("活神仙");
        person1.setSex("女");
        person1.display();
        System.out.println(person1.toString());
    }

    /**
     * 创建Class对象的方式二：通过对象实例方法获取对象
     * 1.先获取操作类的Class对象即字节码文件
     * 2.使用Class对象中的getConstructor
     * 获取该对象的构造方法的对象
     * 有带参数的构造函数的类，先获取到其构造对象，再通过该构造方法类获取实例：
     * 3.使用构造方法对象的newInstance（init args）方法就可以实例化一个对象
     * 4.private修饰的方法，需要设置某些访问权限setAccessable()
     */
    public static void createobj2() throws Exception {
        Class classType = Person.class;
        System.out.println(classType + " classType");
        Constructor<Person> con = classType.getConstructor(String.class, int.class ,String.class);//该对象构造函数的参数个数
        Object obj = con.newInstance("祝海波 ", 23,"男");//（里面的参数歌数对应该对象的构造方法）
        System.out.println("使用constructor对象的newInstance()方法创建对象的信息：" + ((Person) obj).toString());
    }

    /**
     * 第三、通过Object类的getClass方法
     */
    public static void createobj3() throws Exception {
        Person person3 = new Person();
        Class class3 = person3.getClass();
        System.out.println("class3: " + class3);
//        person3.setAge(451);
//        person3.setName("三四岁");
//        System.out.println(person3.toString());
        String s = new String("ss");
        String s1 = "ss";
        String s2 = "s"+"s";
        String s3 = new String("s");
        String s4 = "s";
        String s5 = s3 + s4;

//        System.out.println("s == s1:"+(s == s1));
//        System.out.println("s1 == s2:"+(s1 == s2));
//        System.out.println("s3 == s5："+(s3 == s5));
        System.out.println(s == s1);
        System.out.println(s.equals(s1));
        System.out.println(s == s2);
        System.out.println(s == s3);
        System.out.println(s == s4);
        System.out.println(s == s5);

    }

}
