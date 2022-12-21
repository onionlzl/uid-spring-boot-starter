package com.baidu.fsg.uid.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Content:
 * @Author lizhenlong
 * @Date 2022/12/21 16:09
 */
@Configuration
@ImportResource(locations = { "classpath:config/cached-uid-spring.xml" })
public class UIDConfig {
}
