package com.zhb.Thread;


import com.zhb.Obj.Gem;

import java.util.concurrent.ArrayBlockingQueue;


/**
 * @program: StudyJava
 * @description: ${description}
 * @author: ls
 * @create: 2018-09-03 13:56
 */
public class ThreadSpead {
//    private int queueSize = 4;
//    private ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(queueSize);
    public static void main(String[] args) {
        ThreadSpead pc = new ThreadSpead();
//        Producer producer = pc.new Producer();
//        Consumer consumer = pc.new Consumer();
//        producer.start();
//        consumer.start();
//        Thread put = pc.new Producer();
//        Thread get = pc.new Consumer();
//        put.start();
//        get.start();
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(4);
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }
    //生产者
    static class Producer implements Runnable{
        ArrayBlockingQueue<String> queue;
        public Producer(ArrayBlockingQueue<String> queue) {
            this.queue = queue;
        }
        @Override
        public void run() {
            while (true){
                try {
                    String gem = Gem.getRandomGem();
                    System.out.println("----1----"+gem+"开始合成-------");
                    Thread.sleep(300);
                    System.out.println("----2----"+gem+"合成成功--------");
                    queue.put(gem);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
    //消费者
    static class Consumer implements Runnable{
        ArrayBlockingQueue<String> queue;
        public Consumer(ArrayBlockingQueue<String> queue) {
            this.queue = queue;
        }
		@Override
		public void run() {
			while (true){
	            try {
	                String take = queue.take();
	                System.out.println("镶嵌" + take);
	                Thread.sleep(300);
	                System.out.println("体验" + take);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
		}
    }
}
