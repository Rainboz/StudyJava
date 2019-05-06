package com.zhb.javaSE.package201904.package_object.test1_Collections;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: StudyJava
 * @description:创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方法来操作 User 对象，
 * 使用 Junit 单元测试类进行测试。
 * @author: rainboz
 * @create: 2019-04-23 14:15
 **/
public class TestUser {
    Dao<User> dao = new Dao<User>();
    Map<String, User> map = new HashMap<String, User>();

    @Test
    public void testDao() {
//        User user = new User(1, 22, "张三");
        /**
         * @description:测试save();
         */
        dao.setMap(map);
        dao.save("0001", new User(1, 22, "张三"));
        dao.save("0002", new User(2, 18, "李四"));
        dao.save("0003", new User(3, 36, "王五"));
        dao.save("0004", new User(4, 23, "小明"));
        dao.save("0005", new User(5, 16, "小红"));
        System.out.println("遍历User集合: ");
        Set<Map.Entry<String, User>> entry = dao.getMap().entrySet();//返回此地图中包含的映射的Set视图。
        for (Map.Entry<String, User> en : entry) {
            System.out.println(en);
        }
        System.out.println();
        /**
         * @description:测试get();
         */
        System.out.println("get id=0001的value: ");
        System.out.println(dao.get("0001"));
        System.out.println();
        /**
         * @description:测试update();BUG：更新不管怎么样都会新增一条记录，修复：传入的String，id，有误0001；
         */
        System.out.println("更新id=0001的值: ");
        dao.update("0001", new User(1, 25, "张哥"));
        for (Map.Entry<String, User> en : entry) {
            System.out.println(en);
        }
        System.out.println();
        /**
         * @description:测试list();
         */
        System.out.println("使用dao.list()方法遍历User信息: ");
        for (User user : dao.list()) {
            System.out.println(user);
        }
        System.out.println();
        /**
         * @description:测试delete();
         */
        System.out.println("删除id=0001: ");
        dao.delete("0001");
        for (Map.Entry<String, User> en : entry) {
            System.out.println(en);
        }
        System.out.println();
        /**
         *@description:返回此地图中包含的键的Set视图。
         */
        System.out.println("使用dao.getKey()方法遍历Key信息: ");
        for (String str : dao.getKey()) {
            System.out.println("str: " + str);
            System.out.println(str + "====" + dao.getMap().get(str));
        }
    }

 /*   @Test
    public void testGet() {
        dao.get("0001");
    }

    @Test
    public void testUpdate() {
        User user = new User(1, 22, "张三");
        dao.update("0001", user);
    }

    @Test
    public void testList() {
        dao.list();
        System.out.println(dao.list());
    }

    @Test
    public void testDelete() {
        dao.delete("0001");
    }*/

}
