package lld.design.questions.Logger;

public class ErrorLogger  extends Logger{

    ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String message, LogLevel logLevel) {
        if(logLevel.equals(LogLevel.ERROR)) {
            System.out.println("Error log "+message);
        }
        else {
            super.log(message,logLevel);
        }

    }
}
