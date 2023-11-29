package org.example.packageC;
import org.example.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassC {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public String methodC() {
        LOGGER.info("logger info");
        LOGGER.debug("logger debug");
        LOGGER.error("logger error");
        return "ClassC.methodC";
    }
}