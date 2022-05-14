package com.spring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.main.Role;
import com.spring.main.Users;
import com.spring.dao.UsersRepository;

@SpringBootApplication
public class SpringRestApUserApplication {
	static final Logger logger = LogManager.getLogger(SpringRestApUserApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringRestApUserApplication.class, args);
		logger.info("hello!!");
		UsersRepository usersRepository = context.getBean(UsersRepository.class);
		usersRepository.save(createUserObject1());
		usersRepository.save(createUserObject2());
	}

	private static Users createUserObject1() {
		Users user = new Users();
		user.setUsername("user1");
		user.setPassword("testPassword");
		Role role = new Role();
		role.setName("Lab Staff");
		List<Role> roles = Collections.singletonList(role);
		user.setRoles(roles);
		return user;
	}

	private static Users createUserObject2() {
		Users user = new Users();
		user.setUsername("user2");
		user.setPassword("testPassword2");
		Role role1 = new Role();
		role1.setName("Teacher");
		Role role2 = new Role();
		role2.setName("Chairman");
		List<Role> roles = new ArrayList<>();
		roles.add(role1);
		roles.add(role2);
		user.setRoles(roles);
		return user;
	}
}