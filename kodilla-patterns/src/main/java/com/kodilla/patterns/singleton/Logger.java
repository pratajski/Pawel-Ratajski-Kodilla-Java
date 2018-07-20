package com.kodilla.patterns.singleton;

public class Logger {
    private String lastLog = "";
    private static Logger settingsLoggerInstance = null;

    private Logger() {
    }


    public static Logger getInstance() {
        synchronized(Logger.class) {
            if (settingsLoggerInstance == null) {
                settingsLoggerInstance = new Logger();
            }
        }
        return settingsLoggerInstance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }


}