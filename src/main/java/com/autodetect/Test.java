package com.autodetect;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.constructor.Categories;

public class Test {

	public static void main(String[] args) {
		
Resource res = new ClassPathResource("constructor.xml");
		
		BeanFactory bg = new XmlBeanFactory(res);
		
		Categories cs = (Categories)bg.getBean("categories");
		
		cs.show();

	}

}
