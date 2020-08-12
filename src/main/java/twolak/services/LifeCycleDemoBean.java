package twolak.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
	System.out.println("## LifeCycleDemoBean.constructor");
    }

    @Override
    public void setBeanName(String name) {
	System.out.println("## BeanNameAware.setBeanName name: " + name);

    }

    @Override
    public void destroy() throws Exception {
	System.out.println("## DisposableBean.destroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
	System.out.println("## InitializingBean.afterPropertiesSet");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	System.out.println("## ApplicationContextAware.setApplicationContext");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	System.out.println("## BeanFactoryAware.setBeanFactory");
    }
    
    @PostConstruct
    public void postConstruct() {
	System.out.println("## Post Construct @PostConstruct");
    }
    
    @PreDestroy
    public void preDestroy() {
        System.out.println("## Predestroy @PreDestroy");
    }
    
    public void beforeInit(){
        System.out.println("## Before Init BeanPostProcessor.postProcessBeforeInitialization");
    }

    public void afterInit(){
        System.out.println("## After init BeanPostProcessor.postProcessAfterInitialization");
    }

}
