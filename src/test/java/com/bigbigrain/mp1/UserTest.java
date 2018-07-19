package com.bigbigrain.mp1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bigbigrain.mp1.beans.User;
import com.bigbigrain.mp1.mapper.UserMapper;

public class UserTest {

	@Test
	public void testIdWork() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("mp1/applicationContext.xml");
		UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
		User user = new User();
		user.setGender(1);
		user.setName("刘蛟泳");
		userMapper.insert(user);
		System.out.println(user);
	}
	
}
