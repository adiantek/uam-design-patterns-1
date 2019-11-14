package com.uam.poolofobjects;

public class ToolObjectPool extends ObjectPool<Tool> {
    @Override
    protected Tool create() {
        return new Tool();
    }

    @Override
    protected boolean validate(Tool poolingObject) {
        return !poolingObject.isBroken();
    }
}
