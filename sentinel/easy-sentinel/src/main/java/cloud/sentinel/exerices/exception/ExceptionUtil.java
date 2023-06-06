package cloud.sentinel.exerices.exception;

public class ExceptionUtil {
    public static String handleException(){
        return "限流ing";
    }

    public static String fallbackException(){
        return "降级ing";
    }
}
