package com.spring;

import com.spring.test.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: maxinhang.
 * @version: 2024/4/29 11:13.
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("classpath*:application.xml");

//		UserService userService = context.getBean(UserService.class);
		UserService userService = (UserService) context.getBean("aaaaauserService");
		System.out.println(userService);
		// 这句将输出: hello world
		System.out.println(userService.getName());
	}
}
