package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class MyApp {

    private static final Logger logger = LoggerFactory.getLogger("logback");

    public static void main(String[] args) {
        logger.info("Hello Jenkins!");
    }
}
