package com.springmvc.test.dynamic;

public class Tank implements Subject{
    @Override
    public void move() {
        System.out.println("tank moving ...........");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
