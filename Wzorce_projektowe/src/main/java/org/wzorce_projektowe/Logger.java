package org.wzorce_projektowe;

/**
 * Created by Adam Seweryn
 */

public class Logger {
    private static Logger instance;

    private Logger(){}

    public static Logger getInstance(){
        if (Logger.instance==null){
            instance = new Logger();
        }
        return instance;
    }
    public void logToConsole(){
//
    }
}
