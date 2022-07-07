package io.github.cocodex.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author amazfit
 * @date 2022-07-07 下午9:41
 **/
public class Demo {

    private static final Logger logger = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        logger.info("Demo run");
        //基於slf4j，可以使用大括號foramt形式去寫，不需要
        logger.info("name={}","xxxxxxxxxxx");
    }
}
