package com.uam.factorymethod;

import com.uam.factorymethod.logger.Logger;

public class Runner {

    public static void main(String[] args) {
        Logger logger = null;
        logger.info("First text to log as info");
        logger.info("Second text to log as info");
        logger.error("First text to log as error");
    }
}
