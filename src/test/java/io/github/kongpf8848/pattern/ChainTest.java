package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.chain.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ChainTest {

    @Test
    public void test(){
        //责任链模式
        System.out.println("责任链模式+++++++++++++++++++++++++++++++++++");
        AbstractLogger errorLogger = new ErrorLogger();
        AbstractLogger fileLogger = new FileLogger();
        AbstractLogger consoleLogger = new ConsoleLogger();
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        AbstractLogger loggerChain = errorLogger;
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }


    @Test
    public void testChain(){
        List<Interceptor> interceptors=new ArrayList<>();
        interceptors.add(new Interceptor() {
            @Override
            public ActionResponse intercept(Chain chain) {
                System.out.println("++++++++++++++++intercept1");
                ActionRequest request= chain.getRequest();
                request.addHeaders("intercept1");
                return chain.proceed(request);
            }
        });

        interceptors.add(new Interceptor() {
            @Override
            public ActionResponse intercept(Chain chain) {
                System.out.println("++++++++++++++++intercept2");
                ActionRequest request= chain.getRequest();
                request.addHeaders("intercept2");
                return chain.proceed(request);
            }
        });
        interceptors.add(new Interceptor() {
            @Override
            public ActionResponse intercept(Chain chain) {
                System.out.println("++++++++++++++++intercept3");
                ActionRequest request= chain.getRequest();
                request.addHeaders("intercept3");
                return chain.proceed(request);
            }
        });

        interceptors.add(new Interceptor() {
            @Override
            public ActionResponse intercept(Chain chain) {
                System.out.println("++++++++++++++++intercept4");
                ActionRequest request= chain.getRequest();
                request.getHeaders().forEach(s -> {
                    System.out.println("header:"+s);
                });
                ActionResponse response=new ActionResponse();
                response.setData("ok");
                return response;
            }
        });
        ActionRequest request=new ActionRequest();
        RealInterceptorChain chain=new RealInterceptorChain(interceptors,0,request);
        ActionResponse response=chain.proceed(request);
        System.out.println(response.getData());
    }

}
