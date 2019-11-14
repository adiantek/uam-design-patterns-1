package com.uam.factorymethod.logger;

public class LoggerFactory {

    public static Logger getLogger(Environment env, Class<?> cl) {
        switch (env) {
            case DEV:
            case TEST:
                return new ConsoleLogger(cl.getName());
            default:
                return new FileLogger(cl.getName());
        }
    }
}
