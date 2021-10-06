package com.springmvc.test.test;

import com.springmvc.test.dynamic.*;

public class Test {

    public static int a = 3;

    public static void main(String[] args){
        Shape shape = new Shape(new Tank());
        shape.test();
    }



}
