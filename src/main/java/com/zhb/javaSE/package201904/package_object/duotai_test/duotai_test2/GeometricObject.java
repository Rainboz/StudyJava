package com.zhb.javaSE.package201904.package_object.duotai_test.duotai_test2;

/**
 * @program: StudyJava
 * @description:findArea(): double
 * @author: rainboz
 * @create: 19-4-22 下午6:23
 **/
public class GeometricObject {
    protected String coclor;
    protected Double weight;

    protected GeometricObject(String coclor, Double weight) {
        this.coclor = coclor;
        this.weight = weight;
    }

    public String getCoclor() {
        return coclor;
    }

    public void setCoclor(String coclor) {
        this.coclor = coclor;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public double findArea() {

        return 0;
    }
}

