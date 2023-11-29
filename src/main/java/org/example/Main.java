package org.example;
import org.example.packageC.ClassC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        ClassC c = new ClassC();
        logger.info("logger info");
        logger.debug("logger debug");
        logger.error("logger error");
        c.methodC();
    }
}