package com.kodilla.patterns2.facade.api;


import org.springframework.stereotype.Component;

//@Aspect
@Component
public class Watcher {
 //   private static final Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

//    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))"
            //+
         //   "&& args(theNumber) && target(object)"
//    )

//    public void logEvent() {
        //LOGGER.info("Logging the event");
//        LOGGER.info("Logging the event");
//    }



 //   public void logEvent(BigDecimal theNumber, Object object) {
        //LOGGER.info("Logging the event");
//        LOGGER.info("Class: " + object.getClass().getName() + ", Args: " + theNumber);
 //   }
/*
    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time consumed: " + (end - begin) + "[ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }*/
}
