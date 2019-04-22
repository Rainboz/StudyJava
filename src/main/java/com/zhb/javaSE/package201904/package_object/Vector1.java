package com.zhb.javaSE.package201904.package_object;

import java.util.Scanner;

/**
 * @program: StudyJava
 * @description: Vector
 * @author: rainboz
 * @create: 19-4-22 下午4:10
 **/
public class Vector {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入：");
        Vector v=new Vector();
        int maxScore = 0;//��¼��߷�
        for(;;){
            int score = s.nextInt();
            if(score < 0){
                break;
            }
            //3.���������������ĳɼ��е���߷�
            //��ȡѧ���ɼ��е���߷�
            if(maxScore < score){
                maxScore = score;
            }
            //���ν�ѧ���ɼ������v��
            Integer score1 = new Integer(score);
            v.addElement(score1);
        }

        //4.ͨ��v.elementAt(i)���λ�ȡ����v�е�Ԫ�أ�ͬʱ�ж�һ�¸��������ĵȼ��������
        for(int i = 0;i < v.size();i++){
            Integer score = (Integer)v.elementAt(i);
            char level;
            if(maxScore - score <= 10){
                level = 'A';
            }else if(maxScore - score <= 20){
                level = 'B';
            }else if(maxScore - score <= 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("ѧ���ɼ�Ϊ��" + score + ",�ȼ�Ϊ��" + level);
        }

    }
}

