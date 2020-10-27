package org.melody.springbootlearn;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootLearnApplicationTests {

    final static Logger logger = LoggerFactory.getLogger(SpringBootLearnApplicationTests.class);

    @Test
    void contextLoads() {
        logger.trace("这是一个trace日志...");
        logger.debug("这是debug日志...");
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
    }

    @Test
    void logTest(){
//        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//        StatusPrinter.print(lc);

        logger.trace("这是一个trace日志...");
        logger.debug("这是debug日志...");
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
    }
}
