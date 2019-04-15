package com.zhb.Obj;



import java.util.Random;

/**
 * @program: StudyJava
 * @description: ${description}
 * @author: ls
 * @create: 2018-09-03 15:52
 */
public class Gem {

    public static String getRandomGem() {
        String[] gem = {"四级宝石", "三级宝石","二级宝石","一级宝石"};
        Random random = new Random();
        int num = random.nextInt(4);
        //System.out.println("---------生成---------"+gem[num]);
        return gem[num];
    }
    public static void main(String[] args) {
		//getRandomGem();
	}
}
