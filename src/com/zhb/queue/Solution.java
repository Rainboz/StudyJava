package com.zhb.queue;

import javax.swing.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * @author Rainboz E-mail:784269332@qq.com
 * @version 创建时间：2018年8月21日 下午5:39:32 类说明TODO
 */
public class Solution {
	private Queue<Integer> queue = new ArrayDeque<Integer>();
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> vList = null;
		traver(root, 1, vList);
		return vList;
	}
	public void traver(TreeNode root,int level,List<List<Integer>> vList){
		if(root==null) return;
        
	}
}
