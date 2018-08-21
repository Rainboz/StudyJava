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
    	p.push(1);//s1[1],s2[]---->pop()
    	System.out.println(p.pop());//s1[],s[2]---(return s2.pop()---[1])---->s11[],s2[]------>push(2),push(3)
    	
    	p.push(2);//
    	p.push(3);//s1[2,3],s2[]----->top()
    	System.out.println(p.top());//s1[2],s2[3]---->s1[],s2[3,2]--return s2.peek()--[2]-->s1[],s2[3,2]-->pop()
    	System.out.println(p.pop());//s1[],s2[3,2]----->return s2.pop()---[2]----end---。
    	
	}
}
