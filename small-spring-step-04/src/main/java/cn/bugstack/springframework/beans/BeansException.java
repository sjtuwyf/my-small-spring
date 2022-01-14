package cn.bugstack.springframework.beans;

/**
 * @author ssqswyf
 * @date 2022/1/13
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
