package com.zhb.javaSE.package201904.package_object.param;

/**
 * @program: StudyJava
 * @description: \\
 * @author: rainboz
 * @create: 2019-04-19 17:52
 **/
public class Test1 {
    String name;
    public static void main(String[] args) {
        Test1[] h = new Test1[3];
        int z = 0;
        while (z < 3){//0 1 2

            h[z] = new Test1();
            h[z].name = "bilbo";

            if (z == 1){
                h[z].name = "frodo";
            }
            if (z == 2){
                h[z].name = "sam";
            }
            System.out.print(h[z].name+" is a ");
            System.out.println("good Test1 name");
            z = z + 1;//
        }

    }

}
