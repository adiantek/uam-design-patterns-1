package com.uam.factorymethod;

import com.uam.factorymethod.logger.Environment;
import com.uam.factorymethod.logger.Logger;
import com.uam.factorymethod.logger.LoggerFactory;

public class Runner {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Environment.DEV, Runner.class);
        logger.info("Welcome in dev");
        logger.info("First text to log as info");
        logger.info("Second text to log as info");
        logger.error("First text to log as error");

        logger = LoggerFactory.getLogger(Environment.PROD, Runner.class);
        logger.info("Welcome in prod");
        logger.info("First text to log as info");
        logger.info("Second text to log as info");
        logger.error("First text to log as error");
    }
}
