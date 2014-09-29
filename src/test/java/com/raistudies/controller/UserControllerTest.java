package com.raistudies.controller;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import com.raistudies.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({ "classpath:springapp-servlet.xml" })
@DbUnitConfiguration(databaseConnection = "dbSource")
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class,
		DbUnitTestExecutionListener.class })
@DatabaseSetup(value = "classpath:toDoData.xml", type = DatabaseOperation.INSERT)
@DatabaseTearDown(value = "classpath:toDoData.xml", type = DatabaseOperation.DELETE)
public class UserControllerTest {

	@Autowired
	private UserController userController;

	@Test
	public void init() {
		List<User> userlist = userController.init();
		for (User user : userlist) {
			System.out.println(user);
		}
		assertNotNull(userlist);
	}

	@Test
	public void init2() {
		List<User> userlist = userController.init();
		for (User user : userlist) {
			System.out.println(user);
		}
		assertNotNull(userlist);
	}
}
