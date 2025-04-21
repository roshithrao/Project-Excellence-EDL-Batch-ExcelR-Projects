package com.execlr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Flipkart f = new Flipkart(new Ekart());
//        f.deliver();
    	
    	     DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();//Spring container will be created
    	     XmlBeanDefinitionReader reader = 
    	    		new XmlBeanDefinitionReader(beanFactory);
 	    	 reader.loadBeanDefinitions(new ClassPathResource("spring.xml"));
    	     Flipkart f = beanFactory.getBean(Flipkart.class);
    	     f.deliver();
    	   
    }
}


//Spring Core -
// Beans -> Spring Beans
//Dependency injection

//-> Bean Factory -> old container
//ApplicationContext -> New Container


