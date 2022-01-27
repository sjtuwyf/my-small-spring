package cn.bugstack.springframework.core.io;

/**
 * @author ssqswyf
 * @date 2022/1/27
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
