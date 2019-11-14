package com.uam.poolofobjects;

import java.util.Random;

public class Tool implements PoolingObject {
    private static final Random R = new Random();

    public Tool() {
        System.out.println("creating new tool");
    }

    public boolean isBroken() {
        return R.nextBoolean();
    }
}
