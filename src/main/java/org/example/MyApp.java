package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class MyApp {

    private static final Logger logger = LoggerFactory.getLogger("logback");
    private static final int NUMBERS = 5;
    public static void main(String[] args) {
        for (int i = 0; i < NUMBERS; i++) {
            logger.info("Hello Jenkins!");
        }
    }
}
