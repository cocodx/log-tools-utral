package io.github.cocodex.jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author amazfit
 * @date 2022-07-06 下午10:21
 **/
public class Demo {

    private static final Log log = LogFactory.getLog(Demo.class);

    public static void main(String[] args) {
        //输出的是jul的，jcl首先找log4j，没找到就找jul
        log.fatal("xxxxxxxxxxx");
    }
}
