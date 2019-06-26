package com.zhb.LintCode.package_201906;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StudyJava
 * @description: 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。  给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * @author: rainboz
 * @create: 2019-06-25 10:13
 **/
public class Combinations {
    /**
     * 输入："23"
     * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> stringList = letterCombinations("7897");
        System.out.println(stringList.toString());
    }

    // 定义每个数字对应的字符
    static String[] a = new String[] {"","","abc","def",
            "ghi","jkl","mno","pqrs","tuv","wxyz"};
    // 这个是输出的字符串
    static StringBuffer sb = new StringBuffer();

    private static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>(15);
        if (digits.length() == 0) {
            return result;
        }
        zihe(digits,0,result);
        return result;
    }

    private static void zihe(String str, int n, List<String> result) {
        if (n == str.length()) {
            result.add(sb.toString());
            return;
        }
        for (int i = 0; i < a[str.charAt(n)-'0'].length(); i++) {
            sb.append(a[str.charAt(n)-'0'].charAt(i));
            zihe(str, n + 1, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
