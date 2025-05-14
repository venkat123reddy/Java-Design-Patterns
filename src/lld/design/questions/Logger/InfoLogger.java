package lld.design.questions.Logger;

public class InfoLogger extends Logger{

    InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String message, LogLevel logLevel){
        if(logLevel.equals(LogLevel.INFO)){
            System.out.println("Info Logger "+message);
        } else {
            super.log(message,logLevel);
        }
    }
}
