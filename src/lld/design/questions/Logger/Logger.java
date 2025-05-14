package lld.design.questions.Logger;

public abstract class Logger {

    Logger nextLogger;

    Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }



    public void log(String message, LogLevel logLevel){
        if(this.nextLogger!=null) {
            this.nextLogger.log(message,logLevel);
        }
    }
}
