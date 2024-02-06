package org.wzorce_projektowe;

/**
 * Created by Adam Seweryn
 */

public class Logger {
    private static Logger instance;

    private Logger(){}

    public static Logger getInstance(){
        return SingletonHolder.INSTANCE;
    }
    public void logToConsole(){
//
    }
    private static class SingletonHolder{
        private static final Logger INSTANCE = new Logger();
    }
}
