package com.springmvc.test.dynamic;

public class Tank2 {
    public void move() {
        System.out.println("tank2 moving ...........");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
