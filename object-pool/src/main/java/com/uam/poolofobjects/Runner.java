package com.uam.poolofobjects;

public class Runner {

    public static void main(String[] args) {
        ToolObjectPool pool = new ToolObjectPool();
        for (int i = 0; i < 10; i++) {
            System.out.println("getting a new tool");
            Tool tool = pool.getObject();
            System.out.println("received " + tool);
            System.out.println("returning it");
            pool.returnObject(tool);
        }
    }
}
