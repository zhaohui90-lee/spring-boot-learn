package org.melody.springbootlearn.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * @author: melody
 * @date: 2020-10-29
 */
public class SimpleMDC {
    public static void main(String[] args) {

        MDC.put("first", "Dorothy");

        Logger logger = LoggerFactory.getLogger(SimpleMDC.class);

        MDC.put("last", "Parker");
        logger.info("Check enclosure");
        logger.debug("The most 12312321312");

        MDC.put("first", "Richard");
        MDC.put("last", "Nixon");

    }
}
