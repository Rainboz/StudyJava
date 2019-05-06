package com.zhb.mysql;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 19-5-6 下午9:38
 **/
public class Hobby extends User{
    private int hobbyId;
    private String hobbyName;
    private String hobbyContent;
    private User user;

    public Hobby() {
    }

    public Hobby(int hobbyId, String hobbyName, String hobbyContent, User user) {
        this.hobbyId = hobbyId;
        this.hobbyName = hobbyName;
        this.hobbyContent = hobbyContent;
        this.user = user;
    }

    public int getHobbyId() {
        return hobbyId;
    }

    public void setHobbyId(int hobbyId) {
        this.hobbyId = hobbyId;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public String getHobbyContent() {
        return hobbyContent;
    }

    public void setHobbyContent(String hobbyContent) {
        this.hobbyContent = hobbyContent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @Override
    public String toString() {//为啥不能调用父类的toString()输出user对象
        /*
            return "Hobby{" +
                "hobbyId=" + hobbyId +
                ", hobbyName='" + hobbyName + '\'' +
                ", hobbyContent='" + hobbyContent + '\'' +
                ", user=" + user +//这里隐式调用父类toString()会报错
                '}';
            Exception in thread "main" java.lang.StackOverflowError
	            at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:449)
	            at java.lang.StringBuilder.append(StringBuilder.java:136)
	            at com.zhb.mysql.Hobby.toString(Hobby.java:77)
         */
        return "Hobby{" +
                "hobbyId=" + hobbyId +
                ", hobbyName='" + hobbyName + '\'' +
                ", hobbyContent='" + hobbyContent + '\'' +
                "User[" +
                "userId=" + user.getUserId() +
                ", userName='" + user.getUserName() + '\'' +
                ", age=" + user.getAge() +
                ", sex=" + user.getSex() +
                ']'+
                '}';
    }
}

