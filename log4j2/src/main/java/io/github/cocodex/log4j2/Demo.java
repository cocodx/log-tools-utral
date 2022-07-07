package io.github.cocodex.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author amazfit
 * @date 2022-07-08 上午12:29
 **/
public class Demo {

    private static final Logger logger = LogManager.getLogger(Demo.class);

    public static void main(String[] args) {
        logger.info("11111111111111111111");
        String name="aaaa";
        logger.info("name={}",name);
    }
}
