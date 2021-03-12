package com.simple.javathreaddemo.runnable;

/**
 * @author Simple
 * @date 2021/3/11 15:12
 * 多个线程操作同一对象 买火车票例子
 */
public class MyRunnable2 implements Runnable{

    private int ticketNums = 10;

    @Override
    public void run() {
        while (true){
            if(ticketNums<=0){
                break;
            }
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--->拿到了第"+ticketNums--+"票");
        }
    }

    public static void main(String[] args) {
        MyRunnable2 myRunnable2 = new MyRunnable2();
        new Thread(myRunnable2,"小明").start();
        new Thread(myRunnable2,"小红").start();
        new Thread(myRunnable2,"黄牛党").start();

    }
}
