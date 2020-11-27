package com.xiaoye;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description :
 * @Author : ChenYao(https://blog.csdn.net/chenyao1994)
 * @Version : 1.0
 * @Create : 2020/11/27 16:25
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
		classPathXmlApplicationContext.getBean("xiaoye");
	}
}
