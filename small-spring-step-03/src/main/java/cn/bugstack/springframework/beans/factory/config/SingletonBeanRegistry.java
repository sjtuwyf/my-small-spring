package cn.bugstack.springframework.beans.factory.config;

/**
 * @author ssqswyf
 * @date 2022/1/13
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
