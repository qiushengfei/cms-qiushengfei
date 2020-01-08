package com.qiushengfei.tset;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qiushengfei.cms.dao.UserDao;
import com.qiushengfei.cms.entity.User;

public class UserTest {

	@Test
	public void test() {
		ApplicationContext as = new ClassPathXmlApplicationContext("spring-beans.xml");
		UserDao bean = as.getBean(UserDao.class);
	User user= new User();
		List<User> select = bean.select(user);
		for (User user2 : select) {
			System.out.println(user2);
		}
		
		
		
		
	}

}
