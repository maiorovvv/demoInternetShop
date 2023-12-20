package org.demointernetshop.configuration.log;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
@Aspect
@Slf4j
public class LogConfiguration {
    @Pointcut("execution (public *  org.demointernetshop.controllers.*.*(..))")
    public void logForControllers(){}

    @Before("logForControllers()")
    public void beforeUsingAnyController(JoinPoint point){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert attributes != null;
        HttpServletRequest request = attributes.getRequest();
        log.info("""
                    RECEIVED REQUEST:
                     IP: {}
                     HTTP METHOD: {}
                     URL: {}
                     """,
                request.getRemoteAddr(),
                request.getMethod(),
                request.getRequestURI().toString());

    }
}
