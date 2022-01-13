package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * @author ssqswyf
 * @date 2022/1/13
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
