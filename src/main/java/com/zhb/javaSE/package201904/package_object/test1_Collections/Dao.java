package com.zhb.javaSE.package201904.package_object.test1_Collections;

import java.util.*;

/**
 * @program: StudyJava
 * @description:定义个泛型类,DAO<T>，在其中定义一个Map成员变量，Map的键为String类型，值为T类型。
 * @author: rainboz
 * @create: 2019-04-23 14:10
 **/
public class Dao<T> {
    private Map<String, T> map;

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    /**
     * @param id
     * @param entity
     * @description:保存T类型的对象到Map成员变量中
     */
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    /**
     * @param id
     * @return
     * @description:从map中获取id对应的对象
     */
    T get(String id) {
        //System.out.println(map.get(id));
        return map.get(id);
    }

    /**
     * @param id
     * @param entity
     * @description:替换map中key为id的内容,改为entity对象
     */
    void update(String id, T entity) {
        map.put(id, entity);
    }

    /**
     * @return
     * @description:返回map中存放的所有T对象
     */
    List<T> list() {
        List<T> list = new ArrayList<T>();
        for (String s : map.keySet()) {
            list.add(map.get(s));
        }
        return list;
    }

    /**
     * @param id
     * @description:删除指定id对象
     */
    void delete(String id) {
        map.remove(id);
    }
    //返回左右Key
    Set<String> getKey(){
        Set<String> s = new HashSet<String>();
        return s = map.keySet();//返回此地图中包含的键的Set视图。
    }
}
