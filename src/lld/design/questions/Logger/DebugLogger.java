package lld.design.questions.Logger;

public class DebugLogger extends Logger{
    DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String message, LogLevel logLevel){
        if(logLevel.equals(LogLevel.DEBUG)) {
            System.out.println("Debug Log "+message);
        } else {
            super.log(message, logLevel);
        }
    }

}
