package com.zhb.queue;

import java.util.Stack;

/**
 * @author Rainboz E-mail:784269332@qq.com
 * @version 创建时间：2018年8月21日 下午1:32:34
 * 类说明TODO
 */
public class MyQueue {
	private Stack<Integer> stack1 = new Stack<Integer>();
	private Stack<Integer> stack2 = new Stack<Integer>();
	public MyQueue() {
        // do intialization if necessary
		 stack1=new Stack<Integer>();
	     stack2=new Stack<Integer>();
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        // write your code here
    	stack1.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
    	if(stack2.empty())
        {
            while(!stack1.empty()){
                int s1 = stack1.pop();
                stack2.push(s1);
            }
        }
        return stack2.pop();
    }

    /*
     * @return: An integer
     */
    public int top() {
    	if(stack2.empty()){
            while(!stack1.empty()){
                int s1 = stack1.pop();
                stack2.push(s1);
            }
            
        }
    	int s2 = stack2.peek();
        return s2;
    }
    public static void main(String[] args) {
    	MyQueue p = new MyQueue();
    	p.push(1);//stack1---//1
    	System.out.println(p.pop());//stack2---//1//stack1---//null
    	
    	p.push(2);//stack1---//2
    	p.push(3);//stack1---//2,3
    	System.out.println(p.top());//stack2---//1
    	System.out.println(p.pop());//stack2---//3
    	
	}
}
