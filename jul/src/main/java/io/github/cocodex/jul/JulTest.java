package io.github.cocodex.jul;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author amazfit
 * @date 2022-07-06 下午10:01
 * jdk自带的日志，官方，不需要引入jar包了
 **/
public class JulTest {

    private static final Logger logger = Logger.getLogger(JulTest.class.getName());

    public static void main(String[] args) {

        logger.log(Level.INFO,"111111111111");
    }
}
