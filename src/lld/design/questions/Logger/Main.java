package lld.design.questions.Logger;

public class Main {

    public static void main(String []arg) {

        Logger logger = new DebugLogger(new ErrorLogger(new InfoLogger(null)));

        logger.log("info",LogLevel.INFO);
        logger.log("error",LogLevel.ERROR);
        logger.log("debug",LogLevel.DEBUG);
    }
}
