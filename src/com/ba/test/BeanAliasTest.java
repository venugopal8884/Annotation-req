package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.FlipKartOrderService;

public class BeanAliasTest {

	public static void main(String[] args) {
		BeanFactory beanfactory=new XmlBeanFactory(new ClassPathResource("com/ba/common/application-context.xml"));
		FlipKartOrderService FlipKart=beanfactory.getBean("FlipKart",FlipKartOrderService.class);
		System.out.println(FlipKart);
		

	}

}
