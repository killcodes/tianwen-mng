package com.springmvc.test.dynamic;

public class TankProxy implements Subject{

    private Subject tank;

    public TankProxy(Subject tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        long time = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println("tank 移动耗时:" + (end - time) + "ms");
    }
}
