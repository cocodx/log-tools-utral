package io.github.cocodex.jul;

import java.util.logging.Logger;

/**
 * @author amazfit
 * @date 2022-07-08 上午12:42
 **/
public class SetLogProperties {

    static {
        System.setProperty("java.util.logging.config.file",SetLogProperties.class.getClassLoader().getResource("logging.properties").getPath());
    }
    private static final Logger logger = Logger.getLogger(SetLogProperties.class.getName());
    public static void main(String[] args) {
        logger.finest("xxxxx");
    }
}
