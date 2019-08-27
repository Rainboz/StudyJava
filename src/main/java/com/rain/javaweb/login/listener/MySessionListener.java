package com.rain.javaweb.login.listener;
/**
 * @progrom StudyJava
 * @Description TODO 监听session生命周期相关事件
 * @Author rainboz
 * @Date 2019-08-27 上午10:25
 */


import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener()
public class MySessionListener implements HttpSessionListener {

    /*
     * @Description: //TODO session对象创建时执行
     * @Date 上午10:28 19-8-27
     * @Param [se]
     * @return void
     */
    public void sessionCreated(HttpSessionEvent se) {
        /**
         * servletContext:servlet上下文对象
         * Web应用服务器会为web应用创建唯一一个ServletContext对象
         * 在整个web应用作用域最大且所有用户共享
         * servletContext在web应用服务器启动时创建，服务器销毁对象销毁*
         */

        //获取ServletContext
        ServletContext sc = se.getSession().getServletContext();
        //绑定在线人数，通过count这个key
        Object count = sc.getAttribute("count");
        if (count == null){
            //第一个用户登录
            System.out.println("count: "+count);
            sc.setAttribute("count",1);
        }else {
            //已经绑定过，在原先基础上+1
            System.out.println("countOld: "+count);
            sc.setAttribute("count",(Integer)count+1);
        }

    }

    /**
     * session对象被销毁，则会执行该方法
     *
     * @param se
     */
    public void sessionDestroyed(HttpSessionEvent se) {

    }

}
