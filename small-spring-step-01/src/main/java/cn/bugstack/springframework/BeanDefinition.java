package cn.bugstack.springframework;

/**
 * @author ssqswyf
 * @date 2022/1/13
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
