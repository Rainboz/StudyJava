package com.zhb.javaSE.t14;

public class Vehicle {

    private int speed;
    private int size;

    public Vehicle() {
    }

   public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int move(int s){
        size = s;
        return s;
    }
   public int speedUp(int speedUp){
        speed += speedUp;
        return speedUp;
   }
    public  int speedDown(int speedDown){
        speed -= speedDown;
        return speedDown;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        //并通过方法给它初始化speed,size的值
        Vehicle vehicle = new Vehicle();
        vehicle.setSpeed(80);
        vehicle.setSize(65);
        System.out.println(vehicle.toString());
        //调用加速，减速的方法对速度进行改变。调用 move方法输出移动距离
        vehicle.speedDown(20);
        vehicle.speedUp(65);
        vehicle.move(2);
        System.out.println(vehicle.toString());
     }
}
