package com.zhb.javaSE.package201904.package_collections.package_test;

/**
 * @program: StudyJava
 * @description:
 * @author: rainboz
 * @create: 2019-04-28 11:56
 **/
public class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
