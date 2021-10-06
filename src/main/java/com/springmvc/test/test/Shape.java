package com.springmvc.test.test;

import com.springmvc.test.dynamic.Tank;

public class Shape {

    public static int a = 3;

    int wheelNum;

    public int speed;

    public Tank tank;

    public Shape() {
    }

    public Shape(Tank tank){
        this.tank = tank;
        this.wheelNum = 2;
        this.speed = 4;
    }

    public Shape(int wheelNum, int speed, Tank tank) {
        this.wheelNum = wheelNum;
        this.speed = speed;
        this.tank = tank;
    }

    public void test(){
        tank.move();
    }

}
