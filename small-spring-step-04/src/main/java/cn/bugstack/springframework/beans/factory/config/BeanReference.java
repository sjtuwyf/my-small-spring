package cn.bugstack.springframework.beans.factory.config;

/**
 * @author ssqswyf
 * @date 2022/1/14
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
