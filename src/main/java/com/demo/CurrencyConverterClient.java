package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//import com.springtraining.intro.CurrencyConverter;

public class CurrencyConverterClient {

	public static void main(String[] args) {
//		Resource res = new ClassPathResource("currency.xml");
//		BeanFactory factory = new XmlBeanFactory(res);
//		CurrencyConverter curr = (CurrencyConverter) factory.getBean("currencyConverter");
//		double rupees = curr.dollerToRupee(50.0);
//		System.out.println("50 $ is "+rupees+" Rs.");
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("currency.xml");
		CurrencyConverter cc =(CurrencyConverter) factory.getBean("currencyConverter");
		double rupees = cc.dollerToRupee(50.0);
		System.out.println("50 $ is "+rupees+" Rs.");

	}

}
