package Lab1_CDI.Interceptor;


import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;

public class LoggingInterceptor {

    @AroundInvoke
    public Object log(InvocationContext context) throws Exception {
        long start = System.nanoTime();
        Object result = context.proceed();
        long end = System.nanoTime();
        System.out.println("Method " + context.getMethod().getName() + " executed in " + (end - start) + " ns.");
        return result;
    }
}
