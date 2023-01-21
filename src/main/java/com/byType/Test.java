package com.byType;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("byType.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Categories categories = (Categories) factory.getBean("categories");
		categories.show();


	}

}
